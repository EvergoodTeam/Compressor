package evergoodteam.block;


import evergoodteam.Compressor;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;


public class BlockBase extends Block {

    public BlockBase(Material block, Float strength, BlockSoundGroup sound) {
        super(FabricBlockSettings.of(block).strength(strength).sounds(sound).nonOpaque());

        if(this != null){
            Compressor.BLOCKS.add(this);
        }
    }

    public BlockBase(Material block, Float strength) {
        super(FabricBlockSettings.of(block).strength(strength));

        if(this != null){
            Compressor.BLOCKS.add(this);
        }
    }

}
