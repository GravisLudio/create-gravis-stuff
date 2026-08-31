package net.gravis.stuff;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class VolcanicTarFluid extends FlowingFluid {
    @Override
    public Fluid getFlowing() {
        return GravisStuffMod.FLOWING_VOLCANIC_TAR;
    }

    @Override
    public Fluid getSource() {
        return GravisStuffMod.STILL_VOLCANIC_TAR;
    }

    @Override
    public Item getBucket() {
        return GravisStuffMod.VOLCANIC_TAR_BUCKET;
    }

    @Override
    protected boolean canConvertToSource(ServerLevel level) {
        return false;
    }

    @Override
    protected void beforeDestroyingBlock(LevelAccessor level, BlockPos pos, BlockState state) {
        Block.dropResources(state, level, pos, level.getBlockEntity(pos));
    }

    @Override
    protected int getSlopeFindDistance(LevelReader level) {
        return 2;
    }

    @Override
    protected int getDropOff(LevelReader level) {
        return 2;
    }

    @Override
    public int getTickDelay(LevelReader level) {
        return 20; // Viscous like lava / honey
    }

    @Override
    protected float getExplosionResistance() {
        return 100.0F;
    }

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockGetter level, BlockPos pos, Fluid fluid, Direction direction) {
        return direction == Direction.DOWN && !isSame(fluid);
    }

    @Override
    public boolean isSame(Fluid fluid) {
        return fluid == GravisStuffMod.STILL_VOLCANIC_TAR || fluid == GravisStuffMod.FLOWING_VOLCANIC_TAR;
    }

    @Override
    protected BlockState createLegacyBlock(FluidState state) {
        return GravisStuffMod.VOLCANIC_TAR_BLOCK.defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
    }

    public static class Flowing extends VolcanicTarFluid {
        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Still extends VolcanicTarFluid {
        @Override
        public int getAmount(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
