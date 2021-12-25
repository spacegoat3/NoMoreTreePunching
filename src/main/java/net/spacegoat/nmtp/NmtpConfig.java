package net.spacegoat.nmtp;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

import java.awt.*;

@Config(name = "no_more_tree_punching")
@Config.Gui.Background("minecraft:textures/block/oak_log.png")
public class NmtpConfig implements ConfigData {

    @ConfigEntry.Gui.TransitiveObject
    public Gameplay Gameplay = new Gameplay();

    public static class Gameplay {
        @Comment("Gives the tools harder recipes and new textures to make them feel basic/hand-made. You will now need 2 ropes to craft every tool. A Rope can be crafted with 3 Clay Balls and 4 Plant/Normal Strings.")
                @ConfigEntry.Gui.RequiresRestart
        boolean enableBasicTools = true;
        @Comment("Makes every Stone Block(diorite, stone, etc.) drop 4 pieces of rocks of themselves.")
                @ConfigEntry.Gui.RequiresRestart
        boolean enableRockDrops = true;
    }

    @ConfigEntry.Gui.Excluded
    private transient static boolean registered = false;

    public static synchronized NmtpConfig getConfig(){
        if (!registered){
            AutoConfig.register(NmtpConfig.class, JanksonConfigSerializer::new);
            registered = true;
        }
        return AutoConfig.getConfigHolder(NmtpConfig.class).getConfig();
    }
}


