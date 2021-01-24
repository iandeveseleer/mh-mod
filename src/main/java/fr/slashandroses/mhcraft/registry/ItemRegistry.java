package fr.slashandroses.mhcraft.registry;

import fr.slashandroses.mhcraft.common.ItemNames;
import fr.slashandroses.mhcraft.common.item.DiscItem;
import fr.slashandroses.mhcraft.common.item.SeedItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static fr.slashandroses.mhcraft.MHCraft.*;

public class ItemRegistry {

    public static Item SLATE = new Item(new FabricItemSettings().group(MHCRAFT_ITEMS_GROUP));
    public static Item CLAY_TILE = new Item(new FabricItemSettings().group(MHCRAFT_ITEMS_GROUP));
    public static Item TILE = new Item(new FabricItemSettings().group(MHCRAFT_ITEMS_GROUP));
    public static Item GRAY_BRICK = new Item(new FabricItemSettings().group(MHCRAFT_ITEMS_GROUP));
    public static Item EN_BERLINE_DISC = new DiscItem(13, SoundRegistry.EN_BERLINE_SOUND_EVENT, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).group(MHCRAFT_ITEMS_GROUP));
    public static Item NAZARETH_DISC = new DiscItem(13, SoundRegistry.NAZARETH_SOUND_EVENT, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).group(MHCRAFT_ITEMS_GROUP));
    public static Item BLEUCADAVRE_DISC = new DiscItem(13, SoundRegistry.BLEUCADAVRE_SOUND_EVENT, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).group(MHCRAFT_ITEMS_GROUP));
    public static Item ADEBISI_DISC = new DiscItem(13, SoundRegistry.ADEBISI_SOUND_EVENT, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).group(MHCRAFT_ITEMS_GROUP));

    public static void init() {
        registerItem(ItemNames.SLATE, SLATE);
        registerItem(ItemNames.CLAY_TILE, CLAY_TILE);
        registerItem(ItemNames.TILE, TILE);
        registerItem(ItemNames.GRAY_BRICK, GRAY_BRICK);
        registerItem(ItemNames.EN_BERLINE_DISC, EN_BERLINE_DISC);
        registerItem(ItemNames.NAZARETH_DISC, NAZARETH_DISC);
        registerItem(ItemNames.BLEUCADAVRE_DISC, BLEUCADAVRE_DISC);
        registerItem(ItemNames.ADEBISI_DISC, ADEBISI_DISC);
    }
}
