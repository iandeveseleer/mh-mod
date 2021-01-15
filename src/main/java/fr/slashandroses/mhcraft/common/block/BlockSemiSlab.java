package fr.slashandroses.mhcraft.common.block;

import fr.slashandroses.mhcraft.common.block.enums.SemiSlabType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class BlockSemiSlab extends SlabBlock {

    public static final EnumProperty<SemiSlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;
    private static final VoxelShape BOTTOM_SHAPE;
    private static final VoxelShape BOTTOM_2_SHAPE;
    private static final VoxelShape TOP_SHAPE;
    private static final VoxelShape TOP_2_SHAPE;

    public BlockSemiSlab(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState) (this.getDefaultState().with(TYPE, SemiSlabType.BOTTOM1)).with(WATERLOGGED, false));
    }

    public boolean hasSidedTransparency(BlockState state) {
        return state.get(TYPE) != SemiSlabType.DOUBLE;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        SemiSlabType semiSlabType = state.get(TYPE);
        switch (semiSlabType) {
            case DOUBLE:
                return VoxelShapes.fullCube();
            case TOP1:
                return TOP_SHAPE;
            case TOP2:
                return TOP_2_SHAPE;
            case BOTTOM2:
                return BOTTOM_2_SHAPE;
            default:
                return BOTTOM_SHAPE;
        }
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);
        if (blockState.isOf(this)) {
            return (blockState.with(TYPE, SemiSlabType.DOUBLE)).with(WATERLOGGED, false);
        } else {
            FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
            BlockState blockState2 = (this.getDefaultState().with(TYPE, SemiSlabType.BOTTOM1)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
            Direction direction = ctx.getSide();
            return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitPos().y - (double) blockPos.getY() > 0.5D)) ? blockState2 : (BlockState) blockState2.with(TYPE, SemiSlabType.TOP1);
        }
    }

    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        SemiSlabType semiSlabType = state.get(TYPE);
        if (semiSlabType != SemiSlabType.DOUBLE && itemStack.getItem() == this.asItem()) {
            if (context.canReplaceExisting()) {
                boolean bl = context.getHitPos().y - (double) context.getBlockPos().getY() > 0.5D;
                Direction direction = context.getSide();
                if (semiSlabType == SemiSlabType.BOTTOM1) {
                    return direction == Direction.UP || bl && direction.getAxis().isHorizontal();
                } else {
                    return direction == Direction.DOWN || !bl && direction.getAxis().isHorizontal();
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return state.get(TYPE) != SemiSlabType.DOUBLE && super.tryFillWithFluid(world, pos, state, fluidState);
    }

    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.get(TYPE) != SemiSlabType.DOUBLE && super.canFillWithFluid(world, pos, state, fluid);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if ((Boolean) state.get(WATERLOGGED)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        switch (type) {
            case LAND:
                return false;
            case WATER:
                return world.getFluidState(pos).isIn(FluidTags.WATER);
            case AIR:
                return false;
            default:
                return false;
        }
    }

    static {
        TYPE = EnumProperty.of("type", SemiSlabType.class);
        WATERLOGGED = Properties.WATERLOGGED;
        BOTTOM_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D);
        BOTTOM_2_SHAPE = Block.createCuboidShape(0.0D, 4.0D, 0.0D, 16.0D, 8.0D, 16.0D);
        TOP_SHAPE = Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 12.0D, 16.0D);
        TOP_2_SHAPE = Block.createCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    }
}
