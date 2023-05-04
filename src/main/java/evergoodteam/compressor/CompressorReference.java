package evergoodteam.compressor;

import evergoodteam.chassis.configs.ConfigBase;
import evergoodteam.chassis.objects.resourcepacks.ResourcePackBase;
import evergoodteam.chassis.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompressorReference {

    public static final String MODID = "compressor";

    public static final Logger LOGGER = LoggerFactory.getLogger(StringUtils.capitalize(MODID));

    public static final ConfigBase COMPRESSOR_CONFIGS = new ConfigBase(MODID);
    public static final ResourcePackBase COMPRESSOR_RESOURCES = new ResourcePackBase(COMPRESSOR_CONFIGS, MODID)
            .setIcon("https://evergoodteam.github.io/utils/icons/compressorIcon.png")
            .setColor("e3caa5");
}
