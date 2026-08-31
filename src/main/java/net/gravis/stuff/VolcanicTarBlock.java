package net.gravis.stuff;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.phys.Vec3;

public class VolcanicTarBlock extends LiquidBlock {
    public VolcanicTarBlock(FlowingFluid fluid, BlockBehaviour.Properties properties) {
        super(fluid, properties);
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier applier, boolean inside) {
        super.entityInside(state, level, pos, entity, applier, inside);
        
        // 1. Viscous Sluggish Fluid Physics (Stick like heavy hot tar)
        entity.makeStuckInBlock(state, new Vec3(0.45D, 0.35D, 0.45D));
        
        // 2. High Temperature / Volcanic Combustion (Burns on contact)
        if (!entity.fireImmune()) {
            entity.igniteForSeconds(3.0F);
        }

        // 3. Volcanic Grey Smoke & Soot Clouds on the entity
        if (level.isClientSide()) {
            RandomSource rnd = level.getRandom();
            double x = entity.getX() + (rnd.nextDouble() - 0.5D) * entity.getBbWidth();
            double y = entity.getY() + rnd.nextDouble() * entity.getBbHeight();
            double z = entity.getZ() + (rnd.nextDouble() - 0.5D) * entity.getBbWidth();
            
            level.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0.0D, 0.08D, 0.0D);
            level.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 0.0D, 0.05D, 0.0D);
            level.addParticle(ParticleTypes.ASH, x, y, z, 0.0D, 0.02D, 0.0D);
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
        
        // Ambient boiling volcanic tar bubbles & dark smoke
        if (random.nextInt(3) == 0) {
            double px = pos.getX() + random.nextDouble();
            double py = pos.getY() + 0.9D;
            double pz = pos.getZ() + random.nextDouble();
            
            level.addParticle(ParticleTypes.SMOKE, px, py, pz, 0.0D, 0.03D, 0.0D);
            if (random.nextInt(5) == 0) {
                level.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, px, py, pz, 0.0D, 0.06D, 0.0D);
                level.addParticle(ParticleTypes.ASH, px, py, pz, 0.0D, 0.01D, 0.0D);
            }
        }
    }
}
