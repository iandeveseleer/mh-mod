package fr.slashandroses.mhcraft.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.LightType;

import java.util.Random;

public class BlockGrassBale extends PillarBlock {
    public static final IntProperty DRYING_STAGE = IntProperty.of("drying_stage", 0, 2);
    private final Block finalBlock;

    public BlockGrassBale(Settings settings, Block finalBlock) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(DRYING_STAGE, 0));
        this.finalBlock = finalBlock;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getDimension().hasSkyLight() && (world.getLightLevel(LightType.SKY, pos.offset(Direction.Axis.Y, 10)) - world.getAmbientDarkness() >= 9) && random.nextDouble() < 0.1D && !world.isNight()) {
            int stage = state.get(DRYING_STAGE);
            if (stage != 2) {
                world.setBlockState(pos, state.with(DRYING_STAGE, stage + 1));
            } else {
                world.setBlockState(pos, finalBlock.getDefaultState());
            }
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(DRYING_STAGE);
        super.appendProperties(builder);
    }
}
