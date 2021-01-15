package fr.slashandroses.mhcraft.common.utils;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class RoofTopVoxelShapes {
    public static final VoxelShape TOP_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 4, 16);

    public static final VoxelShape TOP_NORTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 8, 0, 16, 12, 12),
            Block.createCuboidShape(0, 4, 0, 16, 4, 8),
            Block.createCuboidShape(0, 0, 0, 16, 8, 4));

    public static final VoxelShape TOP_EAST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(4, 8, 0, 16, 12, 16),
            Block.createCuboidShape(8, 4, 0, 16, 8, 16),
            Block.createCuboidShape(12, 0, 0, 16, 4, 16));

    public static final VoxelShape TOP_WEST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 8, 0, 12, 12, 16),
            Block.createCuboidShape(0, 4, 0, 8, 8, 16),
            Block.createCuboidShape(0, 0, 0, 4, 4, 16));

    public static final VoxelShape TOP_SOUTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 8, 4, 16, 12, 16),
            Block.createCuboidShape(0, 4, 8, 16, 4, 16),
            Block.createCuboidShape(0, 0, 12, 16, 8, 16));

    public static final VoxelShape TOP_SE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(4, 8, 4, 16, 12, 16),
            Block.createCuboidShape(8, 4, 8, 16, 4, 16),
            Block.createCuboidShape(12, 0, 12, 16, 8, 16));

    public static final VoxelShape TOP_SW_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 8, 4, 12, 12, 16),
            Block.createCuboidShape(0, 4, 8, 8, 4, 16),
            Block.createCuboidShape(0, 0, 12, 4, 8, 16));

    public static final VoxelShape TOP_NW_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 8, 0, 12, 12, 12),
            Block.createCuboidShape(0, 4, 0, 8, 4, 8),
            Block.createCuboidShape(0, 0, 0, 4, 8, 4));

    public static final VoxelShape TOP_NE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(4, 8, 0, 16, 12, 12),
            Block.createCuboidShape(8, 4, 0, 16, 4, 8),
            Block.createCuboidShape(12, 0, 0, 16, 8, 4));
    // 7
    public static final VoxelShape TOP_NWNESW_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 12, 0, 12, 16, 16),
            Block.createCuboidShape(12, 8, 0, 16, 12, 12),
            Block.createCuboidShape(0, 8, 0, 16, 12, 8),
            Block.createCuboidShape(0, 4, 8, 8, 8, 16),
            Block.createCuboidShape(0, 4, 0, 16, 8, 4),
            Block.createCuboidShape(0, 0, 4, 4, 4, 16));

    // 11
    public static final VoxelShape TOP_NWNESE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 12, 0, 16, 16, 12),
            Block.createCuboidShape(4, 8, 12, 16, 12, 16),
            Block.createCuboidShape(8, 8, 0, 16, 12, 16),
            Block.createCuboidShape(0, 4, 0, 8, 8, 8),
            Block.createCuboidShape(12, 4, 0, 16, 8, 16),
            Block.createCuboidShape(0, 0, 0, 12, 4, 4));

    // 13
    public static final VoxelShape TOP_NESWSE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 12, 0, 12, 16, 16),
            Block.createCuboidShape(12, 8, 4, 16, 12, 16),
            Block.createCuboidShape(0, 8, 8, 16, 12, 16),
            Block.createCuboidShape(0, 4, 0, 8, 8, 8),
            Block.createCuboidShape(0, 4, 12, 16, 8, 16),
            Block.createCuboidShape(0, 0, 0, 4, 4, 12));

    // 14
    public static final VoxelShape TOP_NWSWSE_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(0, 12, 0, 16, 16, 16),
            Block.createCuboidShape(4, 12, 0, 16, 16, 16),
            Block.createCuboidShape(0, 8, 4, 16, 12, 16),
            Block.createCuboidShape(0, 8, 8, 16, 12, 16),
            Block.createCuboidShape(8, 4, 0, 16, 8, 8),
            Block.createCuboidShape(0, 4, 12, 16, 8, 16),
            Block.createCuboidShape(12, 4, 0, 16, 4, 12));
}
