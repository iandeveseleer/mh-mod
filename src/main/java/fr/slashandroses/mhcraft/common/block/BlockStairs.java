package fr.slashandroses.mhcraft.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class BlockStairs extends StairsBlock {

    public BlockStairs(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

//    @Environment(EnvType.CLIENT)
//    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
//        spawnSmokeParticle(world, pos, true);
//    }
//
//    public static void spawnSmokeParticle(World world, BlockPos pos, boolean lotsOfSmoke) {
//        Random random = world.getRandom();
//        DefaultParticleType defaultParticleType = ParticleTypes.CAMPFIRE_COSY_SMOKE;
//        world.addImportantParticle(defaultParticleType, true, (double)pos.getX() + 1.0D + random.nextDouble() / 3.0D * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + random.nextDouble() + random.nextDouble(), (double)pos.getZ() + 0.5D + random.nextDouble() / 3.0D * (double)(random.nextBoolean() ? 1 : -1), 0.0D, 0.07D, 0.0D);
//        if (lotsOfSmoke) {
//            world.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1), 0.0D, 0.005D, 0.0D);
//        }
//    }
}
