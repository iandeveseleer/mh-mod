package fr.slashandroses.mhcraft.client;

import fr.slashandroses.mhcraft.registry.ContainerRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;

import static fr.slashandroses.mhcraft.MHCraft.*;


@Environment(EnvType.CLIENT)
public class MHCraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ContainerRegistry.init();
        withTransparancyBlocks.forEach(this::registerWithTransparencyBlock);
        plantsBlocks.forEach(this::registerVegetableBlock);
        leavesBlocks.forEach(this::registerLeaveBlock);
    }

    public void registerVegetableBlock(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutoutMipped());
    }

    public void registerWithTransparencyBlock(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }

    public void registerLeaveBlock(Block block) {
        registerVegetableBlock(block);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                world != null && pos != null
                        ? BiomeColors.getFoliageColor(world, pos)
                        : FoliageColors.getDefaultColor(), block);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
                FoliageColors.getDefaultColor(), block);
    }
}
