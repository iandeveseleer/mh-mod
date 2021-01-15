package fr.slashandroses.mhcraft.client;

import fr.slashandroses.mhcraft.registry.ContainerRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static fr.slashandroses.mhcraft.MHCraft.plantsBlocks;
import static fr.slashandroses.mhcraft.MHCraft.withTransparancyBlocks;


@Environment(EnvType.CLIENT)
public class MHCraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ContainerRegistry.init();
        withTransparancyBlocks.forEach(this::registerWithTransparencyBlocks);
        plantsBlocks.forEach(this::registerVegetableBlocks);
    }

    public void registerVegetableBlocks(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutoutMipped());
    }

    public void registerWithTransparencyBlocks(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }
}
