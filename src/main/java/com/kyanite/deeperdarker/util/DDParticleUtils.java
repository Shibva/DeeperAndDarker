package com.kyanite.deeperdarker.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;

public class DDParticleUtils {
    public static void clientDiggingParticles(RandomSource randomsource, BlockState blockstate, BlockPos pos, Level level) {
        for (int i = 0; i < 30; i++) {
            double d0 = pos.getX() + (double) Mth.randomBetween(randomsource, -0.7F, 0.7F);
            double d1 = pos.getY();
            double d2 = pos.getZ() + (double) Mth.randomBetween(randomsource, -0.7F, 0.7F);
            level.addParticle(new BlockParticleOption(ParticleTypes.BLOCK, blockstate), d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    public static void spawnHeartParticles(Entity entity, RandomSource randomSource) {
        ParticleOptions particleoptions = ParticleTypes.HEART;
        for(int i = 0; i < 7; ++i) {
            double x = randomSource.nextGaussian() * 0.02D;
            double y = randomSource.nextGaussian() * 0.02D;
            double z = randomSource.nextGaussian() * 0.02D;
            entity.level.addParticle(particleoptions, entity.getRandomX(1.0D), entity.getRandomY() + 0.5D, entity.getRandomZ(1.0D), x, y, z);
        }
    }
}