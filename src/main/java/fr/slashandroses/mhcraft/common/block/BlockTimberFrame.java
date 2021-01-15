package fr.slashandroses.mhcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class BlockTimberFrame extends Block {

    private static final VoxelShape SHAPE = VoxelShapes.union(
            //Log SW
            Block.createCuboidShape(0, 0, 0, 2, 16, 2),
            //Log SE
            Block.createCuboidShape(14, 0, 0, 16, 16, 2),
            // Concrete
            Block.createCuboidShape(2, 0, 2, 14, 16, 14),
            //Log NW
            Block.createCuboidShape(0, 0, 14, 2, 16, 16),
            //Log NE
            Block.createCuboidShape(14, 0, 14, 16, 16, 16)
    );

    public BlockTimberFrame(Settings settings) {
        super(settings);
    }

    public boolean hasSidedTransparency(BlockState state) {
        return false;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getRaycastShape(BlockState state, BlockView world, BlockPos pos) {
        return SHAPE;
    }

}
