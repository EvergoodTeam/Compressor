package evergoodteam;

import evergoodteam.chassis.objects.blocks.BlockBase;
import evergoodteam.chassis.objects.groups.ItemGroupBase;
import evergoodteam.chassis.objects.resourcepacks.ResourcePackBase;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static evergoodteam.chassis.objects.assets.LootJson.createBlockBreakLootJson;
import static evergoodteam.chassis.objects.assets.RecipeJson.create3x3RecipeJson;
import static evergoodteam.chassis.objects.assets.RecipeJson.createShapelessRecipeJson;
import static evergoodteam.chassis.objects.resourcepacks.ResourcePackBase.getResourcePack;
import static evergoodteam.chassis.util.handlers.InjectionHandler.*;
import static evergoodteam.chassis.util.handlers.RegistryHandler.registerBlockAndItem;
import static evergoodteam.util.CompressorReference.LOGGER;
import static evergoodteam.util.CompressorReference.MODID;

public class Compressor implements ModInitializer {

    /**
     * @see net.minecraft.block.Blocks
     */

    final List<Block> BLOCKS = new ArrayList<>();

    final Block COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 2.5f, 7.0f, BlockSoundGroup.STONE);
    final Block DOUBLE_COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 5.75f, 8.7f, BlockSoundGroup.STONE);
    final Block TRIPLE_COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 11.25f, 11.1f, BlockSoundGroup.STONE);
    final Block QUADRUPLE_COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 19.0f, 14.2f, BlockSoundGroup.STONE);
    final Block QUINTUPLE_COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 29.0f, 18.0f, BlockSoundGroup.STONE);
    final Block SEXTUPLE_COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 41.25f, 22.5f, BlockSoundGroup.STONE);
    final Block SEPTUPLE_COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 55.75f, 27.7f, BlockSoundGroup.STONE);
    final Block OCTUPLE_COMPRESSED_STONE = new BlockBase(BLOCKS, Material.STONE, 72.5f, 33.6f, BlockSoundGroup.STONE);

    final Block COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 3.0f, 7.0f, BlockSoundGroup.STONE);
    final Block DOUBLE_COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 6.25f, 8.7f, BlockSoundGroup.STONE);
    final Block TRIPLE_COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 11.75f, 11.1f, BlockSoundGroup.STONE);
    final Block QUADRUPLE_COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 19.5f, 14.2f, BlockSoundGroup.STONE);
    final Block QUINTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 29.5f, 18.0f, BlockSoundGroup.STONE);
    final Block SEXTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 41.75f, 22.5f, BlockSoundGroup.STONE);
    final Block SEPTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 56.25f, 27.7f, BlockSoundGroup.STONE);
    final Block OCTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(BLOCKS, Material.STONE, 73.0f, 33.6f, BlockSoundGroup.STONE);

    final Block COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 1.6f, BlockSoundGroup.GRAVEL);
    final Block DOUBLE_COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 4.85f, BlockSoundGroup.GRAVEL);
    final Block TRIPLE_COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 10.35f, BlockSoundGroup.GRAVEL);
    final Block QUADRUPLE_COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 18.1f, BlockSoundGroup.GRAVEL);
    final Block QUINTUPLE_COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 28.1f, BlockSoundGroup.GRAVEL);
    final Block SEXTUPLE_COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 40.35f, BlockSoundGroup.GRAVEL);
    final Block SEPTUPLE_COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 54.85f, BlockSoundGroup.GRAVEL);
    final Block OCTUPLE_COMPRESSED_GRAVEL = new BlockBase(BLOCKS, Material.AGGREGATE, 71.6f, BlockSoundGroup.GRAVEL);

    final Block COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 1.5f, BlockSoundGroup.SAND);
    final Block DOUBLE_COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 4.75f, BlockSoundGroup.SAND);
    final Block TRIPLE_COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 10.25f, BlockSoundGroup.SAND);
    final Block QUADRUPLE_COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 18.0f, BlockSoundGroup.SAND);
    final Block QUINTUPLE_COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 28.0f, BlockSoundGroup.SAND);
    final Block SEXTUPLE_COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 40.25f, BlockSoundGroup.SAND);
    final Block SEPTUPLE_COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 54.75f, BlockSoundGroup.SAND);
    final Block OCTUPLE_COMPRESSED_SAND = new BlockBase(BLOCKS, Material.AGGREGATE, 71.5f, BlockSoundGroup.SAND);

    final Block COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 1.5f, BlockSoundGroup.GRAVEL);
    final Block DOUBLE_COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 4.75f, BlockSoundGroup.GRAVEL);
    final Block TRIPLE_COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 10.25f, BlockSoundGroup.GRAVEL);
    final Block QUADRUPLE_COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 18.0f, BlockSoundGroup.GRAVEL);
    final Block QUINTUPLE_COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 28.0f, BlockSoundGroup.GRAVEL);
    final Block SEXTUPLE_COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 40.25f, BlockSoundGroup.GRAVEL);
    final Block SEPTUPLE_COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 54.75f, BlockSoundGroup.GRAVEL);
    final Block OCTUPLE_COMPRESSED_DIRT = new BlockBase(BLOCKS, Material.SOIL, 71.5f, BlockSoundGroup.GRAVEL);

    final Block COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 1.4f, BlockSoundGroup.NETHERRACK);
    final Block DOUBLE_COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 4.65f, BlockSoundGroup.NETHERRACK);
    final Block TRIPLE_COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 10.15f, BlockSoundGroup.NETHERRACK);
    final Block QUADRUPLE_COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 17.9f, BlockSoundGroup.NETHERRACK);
    final Block QUINTUPLE_COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 27.9f, BlockSoundGroup.NETHERRACK);
    final Block SEXTUPLE_COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 40.15f, BlockSoundGroup.NETHERRACK);
    final Block SEPTUPLE_COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 54.65f, BlockSoundGroup.NETHERRACK);
    final Block OCTUPLE_COMPRESSED_NETHERRACK = new BlockBase(BLOCKS, Material.STONE, 71.4f, BlockSoundGroup.NETHERRACK);

    final Block COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 2.25f, 5.2f, BlockSoundGroup.BASALT);
    final Block DOUBLE_COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 5.5f, 6.9f, BlockSoundGroup.BASALT);
    final Block TRIPLE_COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 11.0f, 9.3f, BlockSoundGroup.BASALT);
    final Block QUADRUPLE_COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 18.75f, 12.4f, BlockSoundGroup.BASALT);
    final Block QUINTUPLE_COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 28.75f, 16.2f, BlockSoundGroup.BASALT);
    final Block SEXTUPLE_COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 41.0f, 20.7f, BlockSoundGroup.BASALT);
    final Block SEPTUPLE_COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 55.5f, 25.9f, BlockSoundGroup.BASALT);
    final Block OCTUPLE_COMPRESSED_BASALT = new BlockBase(BLOCKS, Material.STONE, 72.25f, 31.8f, BlockSoundGroup.BASALT);

    final Block COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 4.0f, 7.0f, BlockSoundGroup.DEEPSLATE);
    final Block DOUBLE_COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 7.25f, 8.7f, BlockSoundGroup.DEEPSLATE);
    final Block TRIPLE_COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 12.75f, 11.1f, BlockSoundGroup.DEEPSLATE);
    final Block QUADRUPLE_COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 20.5f, 14.2f, BlockSoundGroup.DEEPSLATE);
    final Block QUINTUPLE_COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 30.5f, 18.0f, BlockSoundGroup.DEEPSLATE);
    final Block SEXTUPLE_COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 42.75f, 22.5f, BlockSoundGroup.DEEPSLATE);
    final Block SEPTUPLE_COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 57.25f, 27.7f, BlockSoundGroup.DEEPSLATE);
    final Block OCTUPLE_COMPRESSED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 74.0f, 33.6f, BlockSoundGroup.DEEPSLATE);

    final Block COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 4.5f, 7.0f, BlockSoundGroup.DEEPSLATE);
    final Block DOUBLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 7.75f, 8.7f, BlockSoundGroup.DEEPSLATE);
    final Block TRIPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 13.25f, 11.1f, BlockSoundGroup.DEEPSLATE);
    final Block QUADRUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 21.0f, 14.2f, BlockSoundGroup.DEEPSLATE);
    final Block QUINTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 31.0f, 18.0f, BlockSoundGroup.DEEPSLATE);
    final Block SEXTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 43.25f, 22.5f, BlockSoundGroup.DEEPSLATE);
    final Block SEPTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 57.75f, 27.7f, BlockSoundGroup.DEEPSLATE);
    final Block OCTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(BLOCKS, Material.STONE, 74.5f, 33.6f, BlockSoundGroup.DEEPSLATE);

    final Block COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 2.5f, 7.0f, BlockSoundGroup.STONE);
    final Block DOUBLE_COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 5.75f, 8.7f, BlockSoundGroup.STONE);
    final Block TRIPLE_COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 11.25f, 11.1f, BlockSoundGroup.STONE);
    final Block QUADRUPLE_COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 19.0f, 14.2f, BlockSoundGroup.STONE);
    final Block QUINTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 29.0f, 18.0f, BlockSoundGroup.STONE);
    final Block SEXTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 41.25f, 22.5f, BlockSoundGroup.STONE);
    final Block SEPTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 55.75f, 27.7f, BlockSoundGroup.STONE);
    final Block OCTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(BLOCKS, Material.STONE, 72.5f, 33.6f, BlockSoundGroup.STONE);

    final Block COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 4.0f, 10.0f, BlockSoundGroup.STONE);
    final Block DOUBLE_COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 7.25f, 11.7f, BlockSoundGroup.STONE);
    final Block TRIPLE_COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 12.75f, 14.1f, BlockSoundGroup.STONE);
    final Block QUADRUPLE_COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 20.5f, 17.2f, BlockSoundGroup.STONE);
    final Block QUINTUPLE_COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 30.5f, 21.0f, BlockSoundGroup.STONE);
    final Block SEXTUPLE_COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 42.75f, 25.5f, BlockSoundGroup.STONE);
    final Block SEPTUPLE_COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 57.25f, 30.7f, BlockSoundGroup.STONE);
    final Block OCTUPLE_COMPRESSED_END_STONE = new BlockBase(BLOCKS, Material.STONE, 74.0f, 36.6f, BlockSoundGroup.STONE);

    final ItemGroup COMPRESSOR_GROUP = new ItemGroupBase(MODID, "itemgroup", OCTUPLE_COMPRESSED_COBBLESTONE).group;

    @Override
    public void onInitialize() {

        LOGGER.info("Booting up Compressor");

        init();
    }

    public void init() {


        ResourcePackBase compressorRP = getResourcePack(MODID, MODID);


        addColumnType(new String[]{"basalt", "compressed_deepslate", "blackstone"});
        addAssetInjection(MODID);

        String[] materials = {"stone", "cobblestone", "gravel", "sand", "dirt", "netherrack", "basalt", "deepslate", "cobbled_deepslate", "blackstone", "end_stone"};
        String[] rates = {"", "double_", "triple_", "quadruple_", "quintuple_", "sextuple_", "septuple_", "octuple_"};

        List<String> toolTags = new ArrayList<>();

        int blockIndex = 0;


        for (int i = 0; i < materials.length; i++) {
            for (int j = 0; j < rates.length; j++) {

                String path = rates[j] + "compressed_" + materials[i];

                if (!"octuple_".equals(rates[j])) {
                    registerBlockAndItem("compressor", path, BLOCKS.get(blockIndex), COMPRESSOR_GROUP);
                } else {
                    registerBlockAndItem("compressor", path, BLOCKS.get(blockIndex), COMPRESSOR_GROUP, "item.compressor.octuple_compressed_" + materials[i] + ".tooltip");
                }

                compressorRP.createBlockstate(path);
                compressorRP.createGlobalTag(path);

                toolTags.add(path);
                blockIndex++;

                recipeLootInit(path, materials, rates, i, j);
            }
        }

        compressorRP.createMiningLevelTag("stone", toolTags.toArray(new String[0]))
                .createRequiredToolTag("pickaxe", toolTags.toArray(new String[0]));
    }

    public void recipeLootInit(String path, String[] materials, String[] rates, int i, int j) {
        String previous;

        if (j == 0) previous = "minecraft:" + materials[i];
        else previous = "compressor:" + rates[j - 1] + "compressed_" + materials[i];

        addRecipe("compressor", path, create3x3RecipeJson("item", new Identifier(previous), new Identifier(MODID, path), 1));
        addRecipe("compressor", path + "_sl", createShapelessRecipeJson("item", new Identifier(MODID, path), new Identifier(previous), 9));

        addLoot("compressor", "blocks/" + path, createBlockBreakLootJson(MODID, path));
    }
}
