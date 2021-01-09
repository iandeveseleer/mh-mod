package fr.slashandroses.mhcraft.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static fr.slashandroses.mhcraft.MHCraft.withTransparancyBlocks;


@Environment(EnvType.CLIENT)
public class MHCraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        withTransparancyBlocks.forEach(this::registerWithTransparencyBlocks);
    }

    public void registerWithTransparencyBlocks(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutoutMipped());
    }

//    public void registerColorProvider() {
//        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
//                world != null && pos != null
//                        ? BiomeColors.getFoliageColor(world, pos)
//                        : FoliageColors.getDefaultColor(), leafBlocks.toArray(new Block[]{}));
//    }
}
