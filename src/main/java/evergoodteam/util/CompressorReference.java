package evergoodteam.util;

import evergoodteam.chassis.configs.ConfigBase;
import evergoodteam.chassis.objects.resourcepacks.ResourcePackBase;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompressorReference {

    public static final String MODID = "compressor";

    public static final Logger LOGGER = LogManager.getLogger(StringUtils.capitalize(MODID));

    public static final ConfigBase COMPRESSOR_CONFIGS = new ConfigBase(MODID);
    public static final ResourcePackBase COMPRESSOR_RESOURCES = new ResourcePackBase(COMPRESSOR_CONFIGS, MODID, "https://evergoodteam.github.io/utils/icons/compressorIcon.png", "e3caa5");
}
