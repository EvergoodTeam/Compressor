package evergoodteam.compressor;

import evergoodteam.chassis.common.resourcepack.ResourcePackBase;
import evergoodteam.chassis.config.ConfigBase;
import evergoodteam.chassis.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompressorReference {

    public static final String MODID = "compressor";

    public static final Logger LOGGER = LoggerFactory.getLogger(StringUtils.capitalize(MODID));

    public static final ConfigBase COMPRESSOR_CONFIGS = new ConfigBase(MODID);
    public static final ResourcePackBase COMPRESSOR_RESOURCES = new ResourcePackBase(COMPRESSOR_CONFIGS, MODID, StringUtils.capitalize(MODID), false)
            .setIcon("https://evergoodteam.github.io/utils/icons/compressorIcon.png")
            .setColor("e3caa5");

    static {
        COMPRESSOR_RESOURCES.noProviders = true;
    }
}
