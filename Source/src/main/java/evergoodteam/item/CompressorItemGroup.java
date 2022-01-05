package evergoodteam.item;


import evergoodteam.Compressor;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class CompressorItemGroup {
    public static final ItemGroup COMPRESSOR = FabricItemGroupBuilder.build(new Identifier("compressor", "compressor"),
            () -> new ItemStack(Compressor.OCTUPLE_COMPRESSED_COBBLESTONE));
}
