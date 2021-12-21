package net.spacegoat.nmtp;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

@Config(name = Main.MOD_ID)
public class NmtpConfig implements ConfigData {

    //ENABLE BASIC TOOLS PACK
    boolean enableBasicTools = true;
    //ENABLE ROCK DROPS PACK
    boolean enableRockDrops = true;

    private transient static boolean registered = false;

    public static synchronized NmtpConfig getConfig(){
        if (!registered){
            AutoConfig.register(NmtpConfig.class, JanksonConfigSerializer::new);
            registered = true;
        }
        return AutoConfig.getConfigHolder(NmtpConfig.class).getConfig();
    }
}

