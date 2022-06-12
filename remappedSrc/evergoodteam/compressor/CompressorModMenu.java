package evergoodteam.compressor;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import evergoodteam.chassis.configs.ConfigBase;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class CompressorModMenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return screen -> new Screen(Text.of("")) {
            @Override
            protected void init() {

                if(ConfigBase.CONFIGURATIONS.get(CompressorReference.MODID) != null){
                    ConfigBase.CONFIGURATIONS.get(CompressorReference.MODID).openConfigFile();
                }
                this.client.setScreen(screen);
            }
        };
    }
}
