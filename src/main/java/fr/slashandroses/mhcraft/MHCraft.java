package fr.slashandroses.mhcraft;

import fr.slashandroses.mhcraft.common.block.BlockVegetable;
import fr.slashandroses.mhcraft.common.item.SeedItem;
import fr.slashandroses.mhcraft.common.recipe.GlassCutterRecipe;
import fr.slashandroses.mhcraft.registry.BlockRegistry;
import fr.slashandroses.mhcraft.registry.GenerationRegistry;
import fr.slashandroses.mhcraft.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.ArrayList;
import java.util.List;

public class MHCraft implements ModInitializer {


    public static final ItemGroup MHCRAFT_BLOCKS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "blocks"), () -> new ItemStack(BlockRegistry.PURE_GLOWSTONE_LAMP));
    public static final ItemGroup MHCRAFT_ITEMS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "items"), () -> new ItemStack(ItemRegistry.SLATE));
    public static final ItemGroup MHCRAFT_PLANTS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "plants"), () -> new ItemStack(Blocks.OAK_LEAVES));
    public static final ItemGroup MHCRAFT_DOORS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "doors"), () -> new ItemStack(BlockRegistry.IRON_BARS_DOOR));
    public static final ItemGroup MHCRAFT_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier(MHConstants.NAMESPACE, "tools"), () -> new ItemStack(BlockRegistry.GLASSCUTTER));
    public static RecipeSerializer<GlassCutterRecipe> GLASSCUTTING;
    public static List<Block> withTransparancyBlocks = new ArrayList<>();
    public static List<Block> plantsBlocks = new ArrayList<>();
    public static List<Block> leavesBlocks = new ArrayList<>();

    @Override
    public void onInitialize() {
        System.out.println("[MHCraft] Initialization...");
        GLASSCUTTING = RecipeSerializer.register(MHConstants.NAMESPACE + ":glasscutting", new GlassCutterRecipe.Serializer2<>(GlassCutterRecipe::new));
        BlockRegistry.init();
        ItemRegistry.init();
        GenerationRegistry.init();
        System.out.println("[MHCraft] Initialized !");
    }

    public static Block registerBlock(String blockName, Block item) {
        registerBlock(blockName, item, MHCRAFT_BLOCKS_GROUP);
        return item;
    }

    public static Block registerBlock(String blockName, Block item, ItemGroup itemGroup) {
        Registry.register(Registry.BLOCK, new Identifier(MHConstants.NAMESPACE, blockName), item);
        Registry.register(Registry.ITEM, new Identifier(MHConstants.NAMESPACE, blockName), new BlockItem(item, new Item.Settings().group(itemGroup)));
        System.out.printf("[MHCraft] Registering %s block%n", blockName);
        return item;
    }

    public static Block registerCropBlock(String blockName, Block item) {
        plantsBlocks.add(item);
        Registry.register(Registry.BLOCK, new Identifier(MHConstants.NAMESPACE, blockName), item);
        System.out.printf("[MHCraft] Registering %s crop block%n", blockName);
        return item;
    }

    public static Block registerDoorBlock(String blockName, Block item) {
        withTransparancyBlocks.add(item);
        registerBlock(blockName, item, MHCRAFT_DOORS_GROUP);
        return item;
    }

    public static Block registerToolBlock(String blockName, Block item) {
        withTransparancyBlocks.add(item);
        registerBlock(blockName, item, MHCRAFT_TOOLS_GROUP);
        return item;
    }

    public static Block registerWithTransparencyBlock(String blockName, Block item) {
        withTransparancyBlocks.add(item);
        registerBlock(blockName, item);
        return item;
    }

    public static Block registerLeavesBlock(String blockName, Block item) {
        leavesBlocks.add(item);
        registerBlock(blockName, item, MHCRAFT_PLANTS_GROUP);
        return item;
    }

    public static Item registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, new Identifier(MHConstants.NAMESPACE, itemName), item);
        if (item instanceof SeedItem) {
            BlockVegetable block = (BlockVegetable) ((SeedItem) item).getBlock();
            block.setSeedsItem(item);
        }
        System.out.printf("[MHCraft] Registering %s item%n", item);
        return item;
    }

    public static <H extends ScreenHandler, S extends Screen & ScreenHandlerProvider<H>> void registerScreen(ScreenHandlerType<? extends H> container, ScreenRegistry.Factory<H, S> screen) {
        ScreenRegistry.register(container, screen);
        System.out.printf("[MHCraft] Registering screen%n");
    }

    public static void registerSound(Identifier soundId, SoundEvent soundEvent) {
        Registry.register(Registry.SOUND_EVENT, soundId, soundEvent);
        System.out.printf("[MHCraft] Registering %s sound%n", soundId.getPath());
    }

    public static void registerOreGenerationFeature(String featureName, ConfiguredFeature<?, ?> configuredFeature) {
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MHConstants.NAMESPACE, featureName));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getValue(), configuredFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }
}
