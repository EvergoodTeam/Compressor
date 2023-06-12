package evergoodteam.compressor;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import evergoodteam.chassis.configs.options.BooleanOption;
import evergoodteam.chassis.util.StringUtils;
import evergoodteam.chassis.util.handlers.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.text.Text;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static evergoodteam.compressor.CompressorReference.*;

public class Compressor implements ModInitializer {

    // TODO: [NU] Retry overlays

    @Override
    public void onInitialize() {
        LOGGER.info("Compressing Cobblestone...");

        CrowdinTranslate.downloadTranslations(MODID);

        COMPRESSOR_CONFIGS.addBooleanProperty(COMPRESSOR_RESOURCES.getHideResourcePackProperty())
                .addBooleanProperty(new BooleanOption("showAllTooltips", false,
                        Text.translatable("config.compressor.showAllTooltips"),
                        Text.translatable("config.compressor.showAllTooltips.tooltip"))
                        .setComment("Show a quantity tooltip for all compressed blocks"))
                .registerProperties();

        registerAdditions();
    }

    private void registerAdditions() {

        int index = 0;
        for (Field field : CompressorBlocks.class.getDeclaredFields()) {
            if (Modifier.isFinal(field.getModifiers()) && Block.class.isAssignableFrom(field.getType())) {

                String entryName = field.getName().toLowerCase();

                if (COMPRESSOR_CONFIGS.getOptionStorage().getBooleanOption("showAllTooltips").getValue())
                    RegistryHandler.registerBlockAndItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), CompressorBlocks.COMPRESSOR_GROUP, "item.compressor." + StringUtils.firstFromSplit(entryName, "_") + ".tooltip");

                else {
                    if (!"octuple".equals(StringUtils.firstFromSplit(entryName, "_"))) {
                        RegistryHandler.registerBlockAndItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), CompressorBlocks.COMPRESSOR_GROUP);
                    } else {
                        RegistryHandler.registerBlockAndItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), CompressorBlocks.COMPRESSOR_GROUP, "item.compressor.octuple.tooltip");
                    }
                }

                index++;
            }
        }
    }
}
