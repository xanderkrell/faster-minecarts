package com.github.ndrp.fasterminecarts.config;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class FasterMinecartsModMenuIntegration implements ModMenuApi {	
	
    @Override
    public String getModId() {
        return "faster-minecarts";
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(FasterMinecartsConfig.class, parent).get();
    }
}
