package fr.slashandroses.mhcraft.registry;

import fr.slashandroses.mhcraft.common.ItemNames;
import fr.slashandroses.mhcraft.common.item.SeedItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import static fr.slashandroses.mhcraft.MHCraft.*;

public class ItemRegistry {

    public static Item SLATE = new Item(new FabricItemSettings().group(MHCRAFT_ITEMS_GROUP));
    public static Item RED_SLATE = new Item(new FabricItemSettings().group(MHCRAFT_ITEMS_GROUP));
    public static Item GRAY_BRICK = new Item(new FabricItemSettings().group(MHCRAFT_ITEMS_GROUP));
    public static SeedItem MARIJUANA_SEED = new SeedItem(BlockRegistry.MARIJUANA_CROP, new FabricItemSettings().group(MHCRAFT_PLANTS_GROUP));
    public static Item MARIJUANA = new Item(new FabricItemSettings().group(MHCRAFT_PLANTS_GROUP));

    public static void init() {
        registerItem(ItemNames.SLATE, SLATE);
        registerItem(ItemNames.RED_SLATE, RED_SLATE);
        registerItem(ItemNames.GRAY_BRICK, GRAY_BRICK);
        registerItem(ItemNames.MARIJUANA_SEEDS, MARIJUANA_SEED);
        registerItem(ItemNames.MARIJUANA, MARIJUANA);
    }
}
