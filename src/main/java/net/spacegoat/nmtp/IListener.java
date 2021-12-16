package net.spacegoat.nmtp;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public interface IListener {
    default void worldTick(World world) {
    }

    default void useOnBlock(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
    }

    default void useOnEntity(PlayerEntity player, World world, Hand hand, Entity entity, /* Nullable */ EntityHitResult hitResult) {
    }

    default void useItem(PlayerEntity player, World world, Hand hand) {
    }
}
