package net.spacegoat.nmtp.features;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.world.gen.feature.*;

public class StoneRockFeature extends StructureFeature<DefaultFeatureConfig> {
    public StoneRockFeature(Codec<DefaultFeatureConfig> codec){
        super(codec);
    }
    @Override
    public StructureFeature.StructureStartFactory<DefaultFeatureConfig> getStructureStartFactory(){
        return WorldRenderEvents.Start::new;
    }
}

