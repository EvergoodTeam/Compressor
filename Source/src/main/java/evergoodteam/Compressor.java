package evergoodteam;


import evergoodteam.item.CompressorItemGroup;
import evergoodteam.block.BlockBase;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Compressor implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("Compressor");


	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block COMPRESSED_STONE = new BlockBase(Material.STONE, 2.0f);
	public static final Block DOUBLE_COMPRESSED_STONE = new BlockBase(Material.STONE, 2.0f);
	public static final Block TRIPLE_COMPRESSED_STONE = new BlockBase(Material.STONE, 2.3f);
	public static final Block QUADRUPLE_COMPRESSED_STONE = new BlockBase(Material.STONE, 2.6f);
	public static final Block QUINTUPLE_COMPRESSED_STONE = new BlockBase(Material.STONE, 2.9f);
	public static final Block SEXTUPLE_COMPRESSED_STONE = new BlockBase(Material.STONE, 3.1f);
	public static final Block SEPTUPLE_COMPRESSED_STONE = new BlockBase(Material.STONE, 3.4f);
	public static final Block OCTUPLE_COMPRESSED_STONE = new BlockBase(Material.STONE, 3.7f);

	public static final Block COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 2.0f);
	public static final Block DOUBLE_COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 2.0f);
	public static final Block TRIPLE_COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 2.3f);
	public static final Block QUADRUPLE_COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 2.6f);
	public static final Block QUINTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 2.9f);
	public static final Block SEXTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 3.1f);
	public static final Block SEPTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 3.4f);
	public static final Block OCTUPLE_COMPRESSED_COBBLESTONE = new BlockBase(Material.STONE, 3.7f);

	public static final Block COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 0.6f, BlockSoundGroup.GRAVEL);
	public static final Block DOUBLE_COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 0.6f, BlockSoundGroup.GRAVEL);
	public static final Block TRIPLE_COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 0.9f, BlockSoundGroup.GRAVEL);
	public static final Block QUADRUPLE_COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 1.2f, BlockSoundGroup.GRAVEL);
	public static final Block QUINTUPLE_COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 1.5f, BlockSoundGroup.GRAVEL);
	public static final Block SEXTUPLE_COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 1.8f, BlockSoundGroup.GRAVEL);
	public static final Block SEPTUPLE_COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 2.1f, BlockSoundGroup.GRAVEL);
	public static final Block OCTUPLE_COMPRESSED_GRAVEL = new BlockBase(Material.AGGREGATE, 2.4f, BlockSoundGroup.GRAVEL);

	public static final Block COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 0.5f, BlockSoundGroup.SAND);
	public static final Block DOUBLE_COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 0.8f, BlockSoundGroup.SAND);
	public static final Block TRIPLE_COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 1.1f, BlockSoundGroup.SAND);
	public static final Block QUADRUPLE_COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 1.4f, BlockSoundGroup.SAND);
	public static final Block QUINTUPLE_COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 1.7f, BlockSoundGroup.SAND);
	public static final Block SEXTUPLE_COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 2.0f, BlockSoundGroup.SAND);
	public static final Block SEPTUPLE_COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 2.3f, BlockSoundGroup.SAND);
	public static final Block OCTUPLE_COMPRESSED_SAND = new BlockBase(Material.AGGREGATE, 2.6f, BlockSoundGroup.SAND);

	public static final Block COMPRESSED_DIRT = new BlockBase(Material.SOIL, 0.6f, BlockSoundGroup.GRAVEL);
	public static final Block DOUBLE_COMPRESSED_DIRT = new BlockBase(Material.SOIL, 0.9f, BlockSoundGroup.GRAVEL);
	public static final Block TRIPLE_COMPRESSED_DIRT = new BlockBase(Material.SOIL, 1.2f, BlockSoundGroup.GRAVEL);
	public static final Block QUADRUPLE_COMPRESSED_DIRT = new BlockBase(Material.SOIL, 1.5f, BlockSoundGroup.GRAVEL);
	public static final Block QUINTUPLE_COMPRESSED_DIRT = new BlockBase(Material.SOIL, 1.8f, BlockSoundGroup.GRAVEL);
	public static final Block SEXTUPLE_COMPRESSED_DIRT = new BlockBase(Material.SOIL, 2.1f, BlockSoundGroup.GRAVEL);
	public static final Block SEPTUPLE_COMPRESSED_DIRT = new BlockBase(Material.SOIL, 2.4f, BlockSoundGroup.GRAVEL);
	public static final Block OCTUPLE_COMPRESSED_DIRT = new BlockBase(Material.SOIL, 2.7f, BlockSoundGroup.GRAVEL);

	public static final Block COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 0.4f, BlockSoundGroup.NETHERRACK);
	public static final Block DOUBLE_COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 0.7f, BlockSoundGroup.NETHERRACK);
	public static final Block TRIPLE_COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 1.0f, BlockSoundGroup.NETHERRACK);
	public static final Block QUADRUPLE_COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 1.3f, BlockSoundGroup.NETHERRACK);
	public static final Block QUINTUPLE_COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 1.6f, BlockSoundGroup.NETHERRACK);
	public static final Block SEXTUPLE_COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 1.9f, BlockSoundGroup.NETHERRACK);
	public static final Block SEPTUPLE_COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 2.2f, BlockSoundGroup.NETHERRACK);
	public static final Block OCTUPLE_COMPRESSED_NETHERRACK = new BlockBase(Material.STONE, 2.5f, BlockSoundGroup.NETHERRACK);


	@Override
	public void onInitialize() {

		LOGGER.info("Booting up");

		String[] blocks = {"stone", "cobblestone", "gravel", "sand", "dirt", "netherrack"};
		String[] rates = {"", "double_", "triple_", "quadruple_", "quintuple_", "sextuple_", "septuple_", "octuple_"};

		int index = 0;

		for(int i = 0; i<blocks.length; i++){

			for(int j = 0; j<rates.length; j++){

				Registry.register(Registry.BLOCK, new Identifier("compressor", rates[j]+"compressed_"+blocks[i]), BLOCKS.get(index));
				Registry.register(Registry.ITEM, new Identifier("compressor", rates[j]+"compressed_"+blocks[i]), new BlockItem(BLOCKS.get(index), new FabricItemSettings().group(CompressorItemGroup.COMPRESSOR)));

				index++;
			}
		}

	}
}
