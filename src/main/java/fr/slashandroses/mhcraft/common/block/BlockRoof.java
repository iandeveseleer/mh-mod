package fr.slashandroses.mhcraft.common.block;

import fr.slashandroses.mhcraft.common.utils.RoofBottomVoxelShapes;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.stream.IntStream;

import static fr.slashandroses.mhcraft.common.utils.RoofBottomVoxelShapes.*;
import static fr.slashandroses.mhcraft.common.utils.RoofTopVoxelShapes.*;

public class BlockRoof extends StairsBlock {


    public static final EnumProperty<StairShape> SHAPE;
    private static final VoxelShape[] BOTTOM_SHAPES;
    private static final VoxelShape[] TOP_SHAPES;
    private static final int[] SHAPE_INDICES;

    public BlockRoof(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    private static VoxelShape[] composeBottomShapes() {
        return IntStream.range(0, 16).mapToObj(BlockRoof::composeBottomShape).toArray(VoxelShape[]::new);
    }

    private static VoxelShape composeBottomShape(int i) {
        VoxelShape voxelShape = RoofBottomVoxelShapes.BOTTOM_SHAPE;
        if (i == 1) {
            voxelShape = BOTTOM_NW_SHAPE;
        }
        if (i == 2) {
            voxelShape = BOTTOM_NE_SHAPE;
        }
        if (i == 3) {
            voxelShape = BOTTOM_NORTH_SHAPE;
        }
        if (i == 4) {
            voxelShape = BOTTOM_SW_SHAPE;
        }
        if (i == 5) {
            voxelShape = BOTTOM_WEST_SHAPE;
        }
        if (i == 7) {
            voxelShape = BOTTOM_NWNESW_SHAPE;
        }
        if (i == 8) {
            voxelShape = BOTTOM_SE_SHAPE;
        }
        if (i == 10) {
            voxelShape = BOTTOM_EAST_SHAPE;
        }
        if (i == 11) {
            voxelShape = BOTTOM_NWNESE_SHAPE;
        }
        if (i == 12) {
            voxelShape = BOTTOM_SOUTH_SHAPE;
        }
        if (i == 13) {
            voxelShape = BOTTOM_NESWSE_SHAPE;
        }
        if (i == 14) {
            voxelShape = BOTTOM_NWSWSE_SHAPE;
        }


        return voxelShape;
    }

    private static VoxelShape[] composeTopShapes() {
        return IntStream.range(0, 16).mapToObj(BlockRoof::composeTopShape).toArray(VoxelShape[]::new);
    }

    private static VoxelShape composeTopShape(int i) {
        VoxelShape voxelShape = TOP_SHAPE;
        if (i == 1) {
            voxelShape = TOP_NW_SHAPE;
        }
        if (i == 2) {
            voxelShape = TOP_NE_SHAPE;
        }
        if (i == 3) {
            voxelShape = TOP_NORTH_SHAPE;
        }
        if (i == 4) {
            voxelShape = TOP_SW_SHAPE;
        }
        if (i == 5) {
            voxelShape = TOP_WEST_SHAPE;
        }
        if (i == 7) {
            voxelShape = TOP_NWNESW_SHAPE;
        }
        if (i == 8) {
            voxelShape = TOP_SE_SHAPE;
        }
        if (i == 10) {
            voxelShape = TOP_EAST_SHAPE;
        }
        if (i == 11) {
            voxelShape = TOP_NWNESE_SHAPE;
        }
        if (i == 12) {
            voxelShape = TOP_SOUTH_SHAPE;
        }
        if (i == 13) {
            voxelShape = TOP_NESWSE_SHAPE;
        }
        if (i == 14) {
            voxelShape = TOP_NWSWSE_SHAPE;
        }
        return voxelShape;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (state.get(HALF) == BlockHalf.TOP ? TOP_SHAPES : BOTTOM_SHAPES)[SHAPE_INDICES[this.getShapeIndexIndex(state)]];
    }

    private int getShapeIndexIndex(BlockState state) {
        return (state.get(SHAPE)).ordinal() * 4 + (state.get(FACING)).getHorizontal();
    }

    static {
        SHAPE = Properties.STAIR_SHAPE;
        BOTTOM_SHAPES = composeBottomShapes();
        TOP_SHAPES = composeTopShapes();
        SHAPE_INDICES = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
    }
}
