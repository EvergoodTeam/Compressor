package evergoodteam.compressor;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import evergoodteam.chassis.client.gui.text.GradientText;
import evergoodteam.chassis.config.option.BooleanOption;
import evergoodteam.chassis.config.option.CategoryOption;
import evergoodteam.chassis.util.StringUtils;
import evergoodteam.chassis.util.handlers.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.text.Text;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static evergoodteam.compressor.CompressorReference.*;

public class Compressor implements ModInitializer {

    @Override
    public void onInitialize() {
        LOGGER.info("Compressing cobblestone...");

        CrowdinTranslate.downloadTranslations(MODID);

        setupConfigs();
        registerAdditions();
    }

    private void setupConfigs() {
        COMPRESSOR_CONFIGS.setDisplayTitle(GradientText.copyOf(Text.literal("Compressor"))
                        .setColorPoints(25, "e3caa5", "ccb38f", "e3caa5")
                        .setScrollDelay(2)
                )
                .addCategory(new CategoryOption(COMPRESSOR_CONFIGS, "test", "test comment")
                        .addBooleanOption(COMPRESSOR_RESOURCES.getHideResourcePackProperty())
                        .addBooleanOption(new BooleanOption("showAllTooltips", false,
                                Text.translatable("config.compressor.showAllTooltips"),
                                Text.translatable("config.compressor.showAllTooltips.tooltip")).getBuilder()
                                .setComment("Show a quantity tooltip for all compressed blocks").build()))
                .registerProperties();

        COMPRESSOR_CONFIGS.getNetworkHandler().registerJoinListener();
        COMPRESSOR_CONFIGS.getNetworkHandler().registerServerReceiver();
    }

    private void registerAdditions() {

        RegistryHandler registryHandler = new RegistryHandler(MODID);

        int index = 0;
        for (Field field : CompressorBlocks.class.getDeclaredFields()) {
            if (Modifier.isFinal(field.getModifiers()) && Block.class.isAssignableFrom(field.getType())) {

                String entryName = field.getName().toLowerCase();

                if (COMPRESSOR_CONFIGS.getOptionStorage().getBooleanOption("showAllTooltips").getValue()) {
                    registryHandler.registerBlockWithItem(MODID, entryName, CompressorBlocks.BLOCKS.get(index), Text.translatable("item.compressor." + StringUtils.firstFromSplit(entryName, "_") + ".tooltip"));
                } else {
                    if (!"octuple".equals(StringUtils.firstFromSplit(entryName, "_"))) {
                        registryHandler.registerBlockWithItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index));
                    } else {
                        registryHandler.registerBlockWithItem("compressor", entryName, CompressorBlocks.BLOCKS.get(index), Text.translatable("item.compressor.octuple.tooltip"));
                    }
                }

                index++;
            }
        }

        registryHandler.registerItemGroup(CompressorBlocks.COMPRESSOR_GROUP);

        for (Block block : CompressorBlocks.BLOCKS) {
            registryHandler.addToItemGroup(block.asItem(), CompressorBlocks.COMPRESSOR_GROUP);
        }
    }
}
