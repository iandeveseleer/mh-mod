package fr.slashandroses.mhcraft;

import fr.slashandroses.mhcraft.common.block.VegetableBlock;
import fr.slashandroses.mhcraft.common.item.SeedItem;
import fr.slashandroses.mhcraft.registry.BlockRegistry;
import fr.slashandroses.mhcraft.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class MHCraft implements ModInitializer {


    public static final ItemGroup MHCRAFT_BLOCKS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "blocks"), () -> new ItemStack(BlockRegistry.PURE_GLOWSTONE_LAMP));
    public static final ItemGroup MHCRAFT_ITEMS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "items"), () -> new ItemStack(ItemRegistry.SLATE));
    public static final ItemGroup MHCRAFT_PLANTS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "plants"), () -> new ItemStack(ItemRegistry.MARIJUANA));
    public static List<Block> withTransparancyBlocks = new ArrayList<>();

    @Override
    public void onInitialize() {
        System.out.println("Starting MHCraft initialization...");
        BlockRegistry.init();
        ItemRegistry.init();
        System.out.println("MHCraft intialized !");
    }

    public static Block registerBlock(String blockName, Block item) {
        Registry.register(Registry.BLOCK, new Identifier(MHConstants.NAMESPACE, blockName), item);
        Registry.register(Registry.ITEM, new Identifier(MHConstants.NAMESPACE, blockName), new BlockItem(item, new Item.Settings().group(MHCRAFT_BLOCKS_GROUP)));
        return item;
    }

    public static Block registerCropBlock(String blockName, Block item) {
        withTransparancyBlocks.add(item);
        Registry.register(Registry.BLOCK, new Identifier(MHConstants.NAMESPACE, blockName), item);
        return item;
    }

    public static Block registerWithTransparencyBlocks(String blockName, Block item) {
        withTransparancyBlocks.add(item);
        Registry.register(Registry.BLOCK, new Identifier(MHConstants.NAMESPACE, blockName), item);
        Registry.register(Registry.ITEM, new Identifier(MHConstants.NAMESPACE, blockName), new BlockItem(item, new Item.Settings().group(MHCRAFT_BLOCKS_GROUP)));
        return item;
    }

    public static Item registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, new Identifier(MHConstants.NAMESPACE, itemName), item);
        if (item instanceof SeedItem) {
            VegetableBlock block = (VegetableBlock) ((SeedItem) item).getBlock();
            block.setSeedsItem(item);
        }
        return item;
    }
}
