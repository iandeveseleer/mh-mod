package fr.slashandroses.mhcraft.common.utils;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class RoofBottomVoxelShapes {
    public static final VoxelShape BOTTOM_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 4, 16);

    public static final VoxelShape BOTTOM_NORTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 0, 16, 8, 12),
            Block.createCuboidShape(0, 8, 0, 16, 12, 8),
            Block.createCuboidShape(0, 12, 0, 16, 16, 4));

    public static final VoxelShape BOTTOM_EAST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(4, 4, 0, 16, 8, 16),
            Block.createCuboidShape(8, 8, 0, 16, 12, 16),
            Block.createCuboidShape(12, 12, 0, 16, 16, 16));

    public static final VoxelShape BOTTOM_WEST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 0, 12, 8, 16),
            Block.createCuboidShape(0, 8, 0, 8, 12, 16),
            Block.createCuboidShape(0, 12, 0, 4, 16, 16));

    public static final VoxelShape BOTTOM_SOUTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 4, 16, 8, 16),
            Block.createCuboidShape(0, 8, 8, 16, 12, 16),
            Block.createCuboidShape(0, 12, 12, 16, 16, 16));

    public static final VoxelShape BOTTOM_SE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(4, 4, 4, 16, 8, 16),
            Block.createCuboidShape(8, 8, 8, 16, 12, 16),
            Block.createCuboidShape(12, 12, 12, 16, 16, 16));

    public static final VoxelShape BOTTOM_SW_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 4, 12, 8, 16),
            Block.createCuboidShape(0, 8, 8, 8, 12, 16),
            Block.createCuboidShape(0, 12, 12, 4, 16, 16));

    public static final VoxelShape BOTTOM_NW_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 0, 12, 8, 12),
            Block.createCuboidShape(0, 8, 0, 8, 12, 8),
            Block.createCuboidShape(0, 12, 0, 4, 16, 4));

    public static final VoxelShape BOTTOM_NE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(4, 4, 0, 16, 8, 12),
            Block.createCuboidShape(8, 8, 0, 16, 12, 8),
            Block.createCuboidShape(12, 12, 0, 16, 16, 4));

    // 7
    public static final VoxelShape BOTTOM_NWNESW_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 0, 12, 8, 16),
            Block.createCuboidShape(12, 4, 0, 16, 8, 12),
            Block.createCuboidShape(0, 8, 0, 16, 12, 8),
            Block.createCuboidShape(0, 8, 8, 8, 12, 16),
            Block.createCuboidShape(0, 12, 0, 16, 16, 4),
            Block.createCuboidShape(0, 12, 4, 4, 16, 16));

    // 11
    public static final VoxelShape BOTTOM_NWNESE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 0, 16, 8, 12),
            Block.createCuboidShape(4, 4, 12, 16, 8, 16),
            Block.createCuboidShape(8, 8, 0, 16, 12, 16),
            Block.createCuboidShape(0, 8, 0, 8, 12, 8),
            Block.createCuboidShape(12, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 12, 0, 12, 16, 4));

    // 13
    public static final VoxelShape BOTTOM_NESWSE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(0, 4, 0, 12, 8, 16),
            Block.createCuboidShape(12, 4, 4, 16, 8, 16),
            Block.createCuboidShape(0, 8, 8, 16, 12, 16),
            Block.createCuboidShape(0, 8, 0, 8, 12, 8),
            Block.createCuboidShape(0, 12, 12, 16, 16, 16),
            Block.createCuboidShape(0, 12, 0, 4, 16, 12));

    // 14
    public static final VoxelShape BOTTOM_NWSWSE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 0, 0, 16, 4, 16),
            Block.createCuboidShape(4, 4, 0, 16, 8, 16),
            Block.createCuboidShape(0, 4, 4, 16, 8, 16),
            Block.createCuboidShape(0, 8, 8, 16, 12, 16),
            Block.createCuboidShape(8, 8, 0, 16, 12, 8),
            Block.createCuboidShape(0, 12, 12, 16, 16, 16),
            Block.createCuboidShape(12, 12, 0, 16, 16, 12));

}
