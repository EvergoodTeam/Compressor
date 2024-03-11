package evergoodteam.compressor;

import evergoodteam.chassis.common.block.BlockBase;
import evergoodteam.chassis.common.block.PillarBase;
import evergoodteam.chassis.common.group.ItemGroupBase;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static evergoodteam.compressor.CompressorReference.MODID;

public class CompressorBlocks {

    public static final List<Block> UNCOMPRESSED = Arrays.asList(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.COBBLESTONE, Blocks.GRAVEL, Blocks.SAND, Blocks.DIRT, Blocks.NETHERRACK, Blocks.BASALT, Blocks.DEEPSLATE, Blocks.COBBLED_DEEPSLATE, Blocks.BLACKSTONE, Blocks.END_STONE, Blocks.TUFF, Blocks.CALCITE);
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Block> BASALT = new ArrayList<>();
    public static final List<Block> BLACKSTONE = new ArrayList<>();
    public static final List<Block> DEEPSLATE = new ArrayList<>();

    public static List<Block> getGeneric() {
        List<Block> result = new ArrayList<>(BLOCKS);
        result.removeAll(BASALT);
        result.removeAll(BLACKSTONE);
        result.removeAll(DEEPSLATE);
        return result;
    }

    /*
     * + 3.25
     * + 5.5
     * + 7.75
     * + 10
     * + 12.25
     * + 14.5
     * + 16.75
     */

    // region Blocks
    public static final Block COMPRESSED_STONE = new BlockBase(2.5f, 7.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_STONE = new BlockBase(5.75f, 8.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_STONE = new BlockBase(11.25f, 11.1f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_STONE = new BlockBase(19.0f, 14.2f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_STONE = new BlockBase(29.0f, 18.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_STONE = new BlockBase(41.25f, 22.5f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_STONE = new BlockBase(55.75f, 27.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_STONE = new BlockBase(72.5f, 33.6f, BlockSoundGroup.STONE).addTo(BLOCKS);

    public static final Block COMPRESSED_GRANITE = new BlockBase(2.5f, 7.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_GRANITE = new BlockBase(5.75f, 8.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_GRANITE = new BlockBase(11.25f, 11.1f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_GRANITE = new BlockBase(19.0f, 14.2f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_GRANITE = new BlockBase(29.0f, 18.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_GRANITE = new BlockBase(41.25f, 22.5f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_GRANITE = new BlockBase(55.75f, 27.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_GRANITE = new BlockBase(72.5f, 33.6f, BlockSoundGroup.STONE).addTo(BLOCKS);

    public static final Block COMPRESSED_DIORITE = new BlockBase(2.5f, 7.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_DIORITE = new BlockBase(5.75f, 8.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_DIORITE = new BlockBase(11.25f, 11.1f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_DIORITE = new BlockBase(19.0f, 14.2f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_DIORITE = new BlockBase(29.0f, 18.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_DIORITE = new BlockBase(41.25f, 22.5f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_DIORITE = new BlockBase(55.75f, 27.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_DIORITE = new BlockBase(72.5f, 33.6f, BlockSoundGroup.STONE).addTo(BLOCKS);

    public static final Block COMPRESSED_ANDESITE = new BlockBase(2.5f, 7.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_ANDESITE = new BlockBase(5.75f, 8.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_ANDESITE = new BlockBase(11.25f, 11.1f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_ANDESITE = new BlockBase(19.0f, 14.2f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_ANDESITE = new BlockBase(29.0f, 18.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_ANDESITE = new BlockBase(41.25f, 22.5f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_ANDESITE = new BlockBase(55.75f, 27.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_ANDESITE = new BlockBase(72.5f, 33.6f, BlockSoundGroup.STONE).addTo(BLOCKS);

    public static final Block COMPRESSED_COBBLESTONE = new BlockBase(3.0f, 7.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_COBBLESTONE = new BlockBase(6.25f, 8.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_COBBLESTONE = new BlockBase(11.75f, 11.1f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_COBBLESTONE = new BlockBase(19.5f, 14.2f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(29.5f, 18.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(41.75f, 22.5f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(56.25f, 27.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(73.0f, 33.6f, BlockSoundGroup.STONE).addTo(BLOCKS);

    public static final ItemGroupBase COMPRESSOR_GROUP = new ItemGroupBase(new Identifier(MODID, "itemgroup"))
            .buildItemGroup(builder -> {
                builder.icon(() -> new ItemStack(OCTUPLE_COMPRESSED_COBBLESTONE));
                builder.displayName(Text.translatable("itemGroup.compressor.itemgroup"));
            });

    public static final Block COMPRESSED_GRAVEL = new BlockBase(1.6f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_GRAVEL = new BlockBase(4.85f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_GRAVEL = new BlockBase(10.35f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_GRAVEL = new BlockBase(18.1f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_GRAVEL = new BlockBase(28.1f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_GRAVEL = new BlockBase(40.35f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_GRAVEL = new BlockBase(54.85f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_GRAVEL = new BlockBase(71.6f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);

    public static final Block COMPRESSED_SAND = new BlockBase(1.5f, BlockSoundGroup.SAND).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_SAND = new BlockBase(4.75f, BlockSoundGroup.SAND).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_SAND = new BlockBase(10.25f, BlockSoundGroup.SAND).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_SAND = new BlockBase(18.0f, BlockSoundGroup.SAND).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_SAND = new BlockBase(28.0f, BlockSoundGroup.SAND).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_SAND = new BlockBase(40.25f, BlockSoundGroup.SAND).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_SAND = new BlockBase(54.75f, BlockSoundGroup.SAND).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_SAND = new BlockBase(71.5f, BlockSoundGroup.SAND).addTo(BLOCKS);

    public static final Block COMPRESSED_DIRT = new BlockBase(1.5f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_DIRT = new BlockBase(4.75f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_DIRT = new BlockBase(10.25f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_DIRT = new BlockBase(18.0f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_DIRT = new BlockBase(28.0f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_DIRT = new BlockBase(40.25f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_DIRT = new BlockBase(54.75f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_DIRT = new BlockBase(71.5f, BlockSoundGroup.GRAVEL).addTo(BLOCKS);

    public static final Block COMPRESSED_NETHERRACK = new BlockBase(1.4f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_NETHERRACK = new BlockBase(4.65f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_NETHERRACK = new BlockBase(10.15f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_NETHERRACK = new BlockBase(17.9f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_NETHERRACK = new BlockBase(27.9f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_NETHERRACK = new BlockBase(40.15f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_NETHERRACK = new BlockBase(54.65f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_NETHERRACK = new BlockBase(71.4f, BlockSoundGroup.NETHERRACK).addTo(BLOCKS);

    public static final Block COMPRESSED_BASALT = new PillarBase(2.25f, 5.2f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);
    public static final Block DOUBLE_COMPRESSED_BASALT = new PillarBase(5.5f, 6.9f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);
    public static final Block TRIPLE_COMPRESSED_BASALT = new PillarBase(11.0f, 9.3f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);
    public static final Block QUADRUPLE_COMPRESSED_BASALT = new PillarBase(18.75f, 12.4f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);
    public static final Block QUINTUPLE_COMPRESSED_BASALT = new PillarBase(28.75f, 16.2f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);
    public static final Block SEXTUPLE_COMPRESSED_BASALT = new PillarBase(41.0f, 20.7f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);
    public static final Block SEPTUPLE_COMPRESSED_BASALT = new PillarBase(55.5f, 25.9f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);
    public static final Block OCTUPLE_COMPRESSED_BASALT = new PillarBase(72.25f, 31.8f, BlockSoundGroup.BASALT).addTo(BLOCKS, BASALT);

    public static final Block COMPRESSED_DEEPSLATE = new PillarBase(4.0f, 7.0f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);
    public static final Block DOUBLE_COMPRESSED_DEEPSLATE = new PillarBase(7.25f, 8.7f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);
    public static final Block TRIPLE_COMPRESSED_DEEPSLATE = new PillarBase(12.75f, 11.1f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);
    public static final Block QUADRUPLE_COMPRESSED_DEEPSLATE = new PillarBase(20.5f, 14.2f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);
    public static final Block QUINTUPLE_COMPRESSED_DEEPSLATE = new PillarBase(30.5f, 18.0f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);
    public static final Block SEXTUPLE_COMPRESSED_DEEPSLATE = new PillarBase(42.75f, 22.5f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);
    public static final Block SEPTUPLE_COMPRESSED_DEEPSLATE = new PillarBase(57.25f, 27.7f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);
    public static final Block OCTUPLE_COMPRESSED_DEEPSLATE = new PillarBase(74.0f, 33.6f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS, DEEPSLATE);

    public static final Block COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(4.5f, 7.0f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(7.75f, 8.7f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(13.25f, 11.1f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(21.0f, 14.2f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(31.0f, 18.0f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(43.25f, 22.5f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(57.75f, 27.7f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_COBBLED_DEEPSLATE = new BlockBase(74.5f, 33.6f, BlockSoundGroup.DEEPSLATE).addTo(BLOCKS);

    public static final Block COMPRESSED_BLACKSTONE = new BlockBase(2.5f, 7.0f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);
    public static final Block DOUBLE_COMPRESSED_BLACKSTONE = new BlockBase(5.75f, 8.7f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);
    public static final Block TRIPLE_COMPRESSED_BLACKSTONE = new BlockBase(11.25f, 11.1f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);
    public static final Block QUADRUPLE_COMPRESSED_BLACKSTONE = new BlockBase(19.0f, 14.2f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);
    public static final Block QUINTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(29.0f, 18.0f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);
    public static final Block SEXTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(41.25f, 22.5f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);
    public static final Block SEPTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(55.75f, 27.7f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);
    public static final Block OCTUPLE_COMPRESSED_BLACKSTONE = new BlockBase(72.5f, 33.6f, BlockSoundGroup.STONE).addTo(BLOCKS, BLACKSTONE);

    public static final Block COMPRESSED_END_STONE = new BlockBase(4.0f, 10.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_END_STONE = new BlockBase(7.25f, 11.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_END_STONE = new BlockBase(12.75f, 14.1f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_END_STONE = new BlockBase(20.5f, 17.2f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_END_STONE = new BlockBase(30.5f, 21.0f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_END_STONE = new BlockBase(42.75f, 25.5f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_END_STONE = new BlockBase(57.25f, 30.7f, BlockSoundGroup.STONE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_END_STONE = new BlockBase(74.0f, 36.6f, BlockSoundGroup.STONE).addTo(BLOCKS);

    public static final Block COMPRESSED_TUFF = new BlockBase(2.5f, 7.0f, BlockSoundGroup.TUFF).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_TUFF = new BlockBase(5.75f, 8.7f, BlockSoundGroup.TUFF).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_TUFF = new BlockBase(11.25f, 11.1f, BlockSoundGroup.TUFF).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_TUFF = new BlockBase(19.0f, 14.2f, BlockSoundGroup.TUFF).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_TUFF = new BlockBase(29.0f, 18.0f, BlockSoundGroup.TUFF).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_TUFF = new BlockBase(41.25f, 22.5f, BlockSoundGroup.TUFF).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_TUFF = new BlockBase(55.75f, 27.7f, BlockSoundGroup.TUFF).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_TUFF = new BlockBase(72.5f, 33.6f, BlockSoundGroup.TUFF).addTo(BLOCKS);

    public static final Block COMPRESSED_CALCITE = new BlockBase(1.75f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    public static final Block DOUBLE_COMPRESSED_CALCITE = new BlockBase(5.0f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    public static final Block TRIPLE_COMPRESSED_CALCITE = new BlockBase(10.5f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    public static final Block QUADRUPLE_COMPRESSED_CALCITE = new BlockBase(18.25f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    public static final Block QUINTUPLE_COMPRESSED_CALCITE = new BlockBase(28.25f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    public static final Block SEXTUPLE_COMPRESSED_CALCITE = new BlockBase(40.5f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    public static final Block SEPTUPLE_COMPRESSED_CALCITE = new BlockBase(55.0f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    public static final Block OCTUPLE_COMPRESSED_CALCITE = new BlockBase(71.75f, BlockSoundGroup.CALCITE).addTo(BLOCKS);
    //endregion
}
