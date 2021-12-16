package net.spacegoat.nmtp.feature;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.structure.IglooGenerator;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.StructureStart;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.DynamicRegistryManager;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.IglooFeature;
import net.minecraft.world.gen.feature.StructureFeature;

public class StoneRockFeature extends StructureFeature<DefaultFeatureConfig> {
    public StoneRockFeature(Codec<DefaultFeatureConfig>codec){
        super(codec);
    }
    @Override
    public StructureFeature.StructureStartFactory<DefaultFeatureConfig> getStructureStartFactory(){
        return IglooFeature.Start::new;
    }
    public static class Start extends StructureStart<DefaultFeatureConfig>{
        public Start(StructureFeature<DefaultFeatureConfig> feature, int chunkX, int chunkZ, BlockBox blockBox, int references, long seed){
            super(feature, chunkX, chunkZ, blockBox, references, seed);
        }
        public void init(DynamicRegistryManager registryManager, ChunkGenerator chunkGenerator,
                         StructureManager manager, int chunkX, int chunkZ, Biome biome, DefaultFeatureConfig config){
            int x = chunkX * 1;
            int z = chunkZ * 1;
            int y = chunkGenerator.getHeight(x, z, Heightmap.Type.WORLD_SURFACE_WG);
            BlockPos pos = new BlockPos(x, y, z);
            BlockRotation rotation = BlockRotation.random(this.random);
            IglooGenerator.addPieces(manager, pos, rotation, this.children);
            this.setBoundingBoxFromChildren();
        }
    }
}
