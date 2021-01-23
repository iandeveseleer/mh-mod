package fr.slashandroses.mhcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BlockSlope extends HorizontalFacingBlock {

    public BlockSlope(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch (dir) {
            case NORTH:
                return VoxelShapes.union(
                        Block.createCuboidShape(2, 0, 0, 14, 8, 16),
                        Block.createCuboidShape(2, 8, 8, 14, 16, 16)
                );
            case SOUTH:
                return VoxelShapes.union(
                        Block.createCuboidShape(2, 0, 0, 14, 8, 16),
                        Block.createCuboidShape(2, 8, 0, 14, 16, 8)
                );
            case EAST:
                return VoxelShapes.union(
                        Block.createCuboidShape(0, 0, 2, 16, 8, 14),
                        Block.createCuboidShape(0, 8, 2, 8, 16, 14)
                );
            case WEST:
                return VoxelShapes.union(
                        Block.createCuboidShape(0, 0, 2, 16, 8, 14),
                        Block.createCuboidShape(8, 8, 2, 16, 16, 14)
                );
            default:
                return VoxelShapes.fullCube();
        }
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState) this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }
}
