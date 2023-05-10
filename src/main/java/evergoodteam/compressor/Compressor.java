package evergoodteam.compressor;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import evergoodteam.chassis.datagen.providers.ChassisBlockLootTableProvider;
import evergoodteam.chassis.datagen.providers.ChassisModelProvider;
import evergoodteam.chassis.datagen.providers.ChassisRecipeProvider;
import evergoodteam.chassis.datagen.providers.ChassisTagProvider;
import evergoodteam.chassis.util.StringUtils;
import evergoodteam.chassis.util.handlers.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
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

        //COMPRESSOR_RESOURCES.hide();

        registerAdditions();
        registerProviders();
    }

    private void registerProviders() {

        COMPRESSOR_RESOURCES.providerRegistry = () -> {
            ChassisModelProvider modelProvider = ChassisModelProvider.create(COMPRESSOR_RESOURCES);
            ChassisBlockLootTableProvider blockLootTableProvider = new ChassisBlockLootTableProvider(COMPRESSOR_RESOURCES);
            ChassisTagProvider<Block> tagProvider = ChassisTagProvider.create(Registry.BLOCK, COMPRESSOR_RESOURCES);
            ChassisRecipeProvider recipeProvider = ChassisRecipeProvider.create(COMPRESSOR_RESOURCES);

            modelProvider.buildBlock(consumer -> {

                for (Block b : CompressorBlocks.BASALT) {
                    consumer.registerAxisRotated(b, TexturedModel.CUBE_COLUMN);
                }

                for (Block b : CompressorBlocks.BLACKSTONE) {
                    TexturedModel texturedModel = TexturedModel.SIDE_END_WALL.get(b);
                    consumer.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(b, texturedModel.upload(b, consumer.modelCollector)));
                }

                for (Block d : CompressorBlocks.DEEPSLATE) {
                    TexturedModel texturedModel = TexturedModel.SIDE_END_WALL.get(d);
                    Identifier baseModelId = texturedModel.getModel().upload(d, texturedModel.getTextures(), consumer.modelCollector);
                    consumer.blockStateCollector.accept(BlockStateModelGenerator.createDeepslateState(d, baseModelId, texturedModel.getTextures(), consumer.modelCollector));
                }

                for (Block o : CompressorBlocks.getGeneric()) {
                    consumer.registerSimpleCubeAll(o);
                }

                // Not needed when done at client? good ig
            /*
            for(Block b : CompressorBlocks.BLOCKS){
                consumer.registerParentedItemModel(b, ModelIds.getBlockModelId(b));
            }*/

            /*
            int i = 0;

            for (Field field : CompressorBlocks.class.getDeclaredFields()) {
                if (Modifier.isFinal(field.getModifiers()) && Block.class.isAssignableFrom(field.getType())) {

                    String entryName = field.getName().toLowerCase();
                    Block block = CompressorBlocks.BLOCKS.get(i);

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

                    blockLootTableProvider.buildBlock(block.getLootTableId(), builder -> builder.addDrop(block));
                    tagProvider.build(TagKey.of(Registry.BLOCK_KEY, new Identifier("c", entryName)), builder -> builder.add(block));

                    i++;
                }
            }*/
            });

            int index2 = 0;
            for (Field field : CompressorBlocks.class.getDeclaredFields()) {
                if (Modifier.isFinal(field.getModifiers()) && Block.class.isAssignableFrom(field.getType())) {

                    String entryName = field.getName().toLowerCase();
                    Block block = CompressorBlocks.BLOCKS.get(index2);

                    blockLootTableProvider.buildBlock(block.getLootTableId(), builder -> builder.addDrop(block));
                    tagProvider.build(TagKey.of(Registry.BLOCK_KEY, new Identifier("c", entryName)), builder -> builder.add(block));

                    index2++;
                }
            }

            recipeProvider.build(exporter -> {
                for (int i = 0; i < CompressorBlocks.BLOCKS.size(); i++) {
                    // TODO: switch naming scheme (done?)
                    Block block = CompressorBlocks.BLOCKS.get(i);
                    Block previous = i % 8 == 0 ? CompressorBlocks.UNCOMPRESSED.get(i / 8) : CompressorBlocks.BLOCKS.get(i - 1);
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
                    .addProvider(blockLootTableProvider)
                    .runProviders();
        };
    }

    private void registerAdditions() {

        int index = 0;
        for (Field field : CompressorBlocks.class.getDeclaredFields()) {
            if (Modifier.isFinal(field.getModifiers()) && Block.class.isAssignableFrom(field.getType())) {

                String entryName = field.getName().toLowerCase();

                if (!"octuple".equals(StringUtils.firstFromSplit(entryName, "_"))) {
                    RegistryHandler.registerBlockAndItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), CompressorBlocks.COMPRESSOR_GROUP);
                } else {
                    RegistryHandler.registerBlockAndItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), CompressorBlocks.COMPRESSOR_GROUP, "item.compressor.octuple.tooltip");
                }

                index++;
            }
        }
    }
}
