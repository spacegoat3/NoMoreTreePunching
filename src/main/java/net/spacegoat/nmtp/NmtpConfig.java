package net.spacegoat.nmtp;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = Main.MOD_ID)
@Config.Gui.Background("minecraft:textures/block/oak_log.png")
public class NmtpConfig implements ConfigData {

    @ConfigEntry.Category("enable_basic_tools")
            @Comment("Gives the tools harder recipes and new textures to make them feel basic/hand-made. You will now need 2 ropes to craft every tool. A Rope can be crafted with 3 Clay Balls and 4 Plant/Normal Strings.")
    boolean enableBasicTools = true;

    @ConfigEntry.Category("enable_rock_drops")
            @Comment("Makes every Stone Block(diorite, stone, etc.) drop 4 pieces of rocks of themselves.")
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


