package evergoodteam.compressor;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import evergoodteam.chassis.datagen.providers.ChassisLootTableProvider;
import evergoodteam.chassis.datagen.providers.ChassisModelProvider;
import evergoodteam.chassis.datagen.providers.ChassisRecipeProvider;
import evergoodteam.chassis.datagen.providers.ChassisTagProvider;
import evergoodteam.chassis.util.StringUtils;
import evergoodteam.chassis.util.handlers.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static evergoodteam.compressor.CompressorReference.*;

public class Compressor implements ModInitializer {

    public static final List<String> ENTRY_NAMES = new ArrayList<>();

    // TODO: [NU] Retry overlays

    @Override
    public void onInitialize() {
        LOGGER.info("Compressing Cobblestone...");

        CrowdinTranslate.downloadTranslations(MODID);

        COMPRESSOR_CONFIGS.addBooleanProperty(COMPRESSOR_RESOURCES.getHideResourcePackProperty())
                .registerProperties();

        init();
    }

    public void init() {

        List<Block> uncompressed = Arrays.asList(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.COBBLESTONE, Blocks.GRAVEL, Blocks.SAND, Blocks.DIRT, Blocks.NETHERRACK, Blocks.BASALT, Blocks.DEEPSLATE, Blocks.COBBLED_DEEPSLATE, Blocks.BLACKSTONE, Blocks.END_STONE);

        ChassisModelProvider modelProvider = ChassisModelProvider.create(COMPRESSOR_RESOURCES);
        ChassisLootTableProvider lootTableProvider = ChassisLootTableProvider.create(LootContextTypes.BLOCK, COMPRESSOR_RESOURCES);
        ChassisTagProvider<Block> tagProvider = ChassisTagProvider.create(Registry.BLOCK, COMPRESSOR_RESOURCES);
        ChassisRecipeProvider recipeProvider = ChassisRecipeProvider.create(COMPRESSOR_RESOURCES);

        modelProvider.buildBlock(consumer -> {

            int index = 0;

            for (Field field : CompressorBlocks.class.getDeclaredFields()) {
                if (Modifier.isFinal(field.getModifiers()) && Block.class.isAssignableFrom(field.getType())) {

                    String entryName = field.getName().toLowerCase();

                    if (!"octuple".equals(StringUtils.firstFromSplit(entryName, "_"))) {
                        RegistryHandler.registerBlockAndItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), CompressorBlocks.COMPRESSOR_GROUP);
                    } else {
                        RegistryHandler.registerBlockAndItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), CompressorBlocks.COMPRESSOR_GROUP, "item.compressor.octuple.tooltip");
                    }

                    Block block = CompressorBlocks.BLOCKS.get(index);

                    if (entryName.contains("basalt")) consumer.registerAxisRotated(block, TexturedModel.CUBE_COLUMN);
                    else if (entryName.contains("blackstone")) {
                        TexturedModel texturedModel = TexturedModel.SIDE_END_WALL.get(block);
                        consumer.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, texturedModel.upload(block, consumer.modelCollector)));
                    } else if (entryName.contains("compressed_deepslate")) {
                        TexturedModel texturedModel = TexturedModel.SIDE_END_WALL.get(block);
                        Identifier baseModelId = texturedModel.getModel().upload(block, texturedModel.getTextures(), consumer.modelCollector);
                        consumer.blockStateCollector.accept(BlockStateModelGenerator.createDeepslateState(block, baseModelId, texturedModel.getTextures(), consumer.modelCollector));
                    } else consumer.registerSimpleCubeAll(block);
                    // TODO: why is this needed?
                    consumer.registerParentedItemModel(block, ModelIds.getBlockModelId(block));

                    lootTableProvider.build(block.getLootTableId(), BlockLootTableGenerator.drops(block));
                    tagProvider.build(TagKey.of(Registry.BLOCK_KEY, new Identifier("c", entryName)), builder -> builder.add(block));

                    index++;
                }
            }
        });


        recipeProvider.build(exporter -> {
            for (int i = 0; i < CompressorBlocks.BLOCKS.size(); i++) {
                // TODO: switch naming scheme
                Block block = CompressorBlocks.BLOCKS.get(i);
                Block previous = i % 8 == 0 ? uncompressed.get(i / 8) : CompressorBlocks.BLOCKS.get(i - 1);
                RecipeProvider.offerReversibleCompactingRecipes(exporter, previous, block, RecipeProvider.getItemPath(previous) + "_to_" + RecipeProvider.getItemPath(block), null, RecipeProvider.getItemPath(previous) + "_from_" + RecipeProvider.getItemPath(block), null);
            }
        });

        COMPRESSOR_RESOURCES.addProvider(modelProvider)
                .addProvider(tagProvider
                        .build(BlockTags.NEEDS_STONE_TOOL, builder -> builder
                                .add(CompressorBlocks.BLOCKS.toArray(new Block[0])))
                        .build(BlockTags.PICKAXE_MINEABLE, builder -> builder
                                .add(CompressorBlocks.BLOCKS.toArray(new Block[0])))
                )
                .addProvider(recipeProvider)
                .addProvider(lootTableProvider)
                .runProviders();
    }
}
