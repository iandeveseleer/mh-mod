package fr.slashandroses.mhcraft.registry;

import fr.slashandroses.mhcraft.common.BlockNames;
import fr.slashandroses.mhcraft.common.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

import static fr.slashandroses.mhcraft.MHCraft.*;

public class BlockRegistry {


    // Blocks
    public static Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SCHIST_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block FLINT_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GRAY).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SUGAR_BLOCK = new FallingBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).breakByHand(true).strength(0.8F, 0.8F).sounds(BlockSoundGroup.SAND));
    public static Block SUGAR_CANE_BLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).breakByHand(true).strength(1.5F, 0.8F).sounds(BlockSoundGroup.GRASS));
    public static Block GLOWSTONE_LAMP = new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).luminance(15).sounds(BlockSoundGroup.METAL));
    public static Block PURE_GLOWSTONE = new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.SAND).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).luminance(15).sounds(BlockSoundGroup.GLASS));
    public static Block PURE_GLOWSTONE_LAMP = new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).luminance(15).sounds(BlockSoundGroup.METAL));
    public static Block GRAY_BRICKS = new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP, MaterialColor.GRAY).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block GRAY_BRICKS_STAIRS = new BlockStairs(GRAY_BRICKS.getDefaultState(), FabricBlockSettings.copy(GRAY_BRICKS));
    public static Block GRAY_BRICKS_SLAB = new BlockSlab(FabricBlockSettings.copy(GRAY_BRICKS));
    public static Block STRAW_BLOCK = new HayBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MaterialColor.YELLOW).strength(0.5F).breakByHand(true).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRASS));
    public static Block SLATE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SLATE_STAIRS = new BlockStairs(SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copy(SLATE_BLOCK));
    public static Block SLATE_SLAB = new BlockSlab(FabricBlockSettings.copy(SLATE_BLOCK));
    public static Block SLATE_ROOF = new BlockStairs(SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copy(SLATE_BLOCK).nonOpaque());
    public static Block SLATE_OAK_SHINGLE = new BlockStairs(SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copy(SLATE_BLOCK).nonOpaque());
    public static Block TILE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.RED).breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block TILE_STAIRS = new BlockStairs(TILE_BLOCK.getDefaultState(), FabricBlockSettings.copy(TILE_BLOCK));
    public static Block TILE_SLAB = new BlockSlab(FabricBlockSettings.copy(TILE_BLOCK));
    public static Block TILE_ROOF = new BlockStairs(TILE_BLOCK.getDefaultState(), FabricBlockSettings.copy(TILE_BLOCK).nonOpaque());
    public static Block TILE_OAK_SHINGLE = new BlockStairs(TILE_BLOCK.getDefaultState(), FabricBlockSettings.copy(TILE_BLOCK).nonOpaque());
    public static Block GRASS_BALE = new BlockGrassBale(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MaterialColor.GREEN).strength(0.5F).breakByHand(true).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRASS).ticksRandomly(), STRAW_BLOCK);
    public static Block THATCH_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MaterialColor.YELLOW).strength(0.5F).breakByHand(true).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.GRAVEL));
    public static Block THATCH_BLOCK_STAIRS = new BlockStairs(THATCH_BLOCK.getDefaultState(), FabricBlockSettings.copy(THATCH_BLOCK));
    public static Block THATCH_BLOCK_SLAB = new BlockSlab(FabricBlockSettings.copy(THATCH_BLOCK));
    public static Block THATCH_BLOCK_ROOF = new BlockStairs(THATCH_BLOCK.getDefaultState(), FabricBlockSettings.copy(THATCH_BLOCK).nonOpaque());
    public static Block THATCHED_OAK_SHINGLE = new BlockStairs(THATCH_BLOCK.getDefaultState(), FabricBlockSettings.copy(THATCH_BLOCK).nonOpaque());
    public static Block HAY_PATH = new BlockFloor(FabricBlockSettings.of(Material.SOLID_ORGANIC, MaterialColor.YELLOW).breakByHand(false).breakByTool(FabricToolTags.HOES).strength(0.3F).sounds(BlockSoundGroup.GRASS), true);
    public static Block STRAW_PATH = new BlockFloor(FabricBlockSettings.of(Material.SOLID_ORGANIC, MaterialColor.YELLOW).breakByHand(false).breakByTool(FabricToolTags.HOES).strength(0.3F).sounds(BlockSoundGroup.GRASS), true);
    public static Block THATCH_PATH = new BlockFloor(FabricBlockSettings.of(Material.SOLID_ORGANIC, MaterialColor.YELLOW).breakByHand(false).breakByTool(FabricToolTags.HOES).strength(0.3F).sounds(BlockSoundGroup.GRASS), true);

    // Concrete frames
    public static Block OAK_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).nonOpaque().breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SPRUCE_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).nonOpaque().breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block DARK_OAK_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).nonOpaque().breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block ACACIA_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).nonOpaque().breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block JUNGLE_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).nonOpaque().breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block OAK_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SPRUCE_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block DARK_OAK_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block ACACIA_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block JUNGLE_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));


    // Doors, traps etc..
    public static Block IRON_BARS_DOOR = new BlockDoor(FabricBlockSettings.of(Material.METAL, MaterialColor.BLACK).nonOpaque().breakByHand(false).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.METAL));

    // Tools blocks
    public static Block GLASSCUTTER = new BlockGlassCutter(FabricBlockSettings.of(Material.METAL, MaterialColor.BLACK).nonOpaque().breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    //Plants and Crops

    public static void init() {
        registerBlock(BlockNames.CHARCOAL_BLOCK, CHARCOAL_BLOCK);
        registerBlock(BlockNames.SCHIST_BLOCK, SCHIST_BLOCK);
        registerBlock(BlockNames.FLINT_BLOCK, FLINT_BLOCK);
        registerBlock(BlockNames.SUGAR_BLOCK, SUGAR_BLOCK);
        registerBlock(BlockNames.SUGAR_CANE_BLOCK, SUGAR_CANE_BLOCK);
        registerBlock(BlockNames.GLOWSTONE_LAMP, GLOWSTONE_LAMP);
        registerBlock(BlockNames.PURE_GLOWSTONE, PURE_GLOWSTONE);
        registerBlock(BlockNames.PURE_GLOWSTONE_LAMP, PURE_GLOWSTONE_LAMP);
        registerBlock(BlockNames.GRAY_BRICKS, GRAY_BRICKS);
        registerBlock(BlockNames.GRAY_BRICKS_SLAB, GRAY_BRICKS_SLAB);
        registerBlock(BlockNames.GRAY_BRICKS_STAIRS, GRAY_BRICKS_STAIRS);
        registerBlock(BlockNames.SLATE_BLOCK, SLATE_BLOCK);
        registerBlock(BlockNames.SLATE_SLAB, SLATE_SLAB);
        registerBlock(BlockNames.SLATE_STAIRS, SLATE_STAIRS);
        registerWithTransparencyBlock(BlockNames.SLATE_ROOF, SLATE_ROOF);
        registerWithTransparencyBlock(BlockNames.SLATE_OAK_SHINGLE, SLATE_OAK_SHINGLE);
        registerBlock(BlockNames.TILE_BLOCK, TILE_BLOCK);
        registerBlock(BlockNames.TILE_SLAB, TILE_SLAB);
        registerBlock(BlockNames.TILE_STAIRS, TILE_STAIRS);
        registerWithTransparencyBlock(BlockNames.TILE_ROOF, TILE_ROOF);
        registerWithTransparencyBlock(BlockNames.TILE_OAK_SHINGLE, TILE_OAK_SHINGLE);
        registerBlock(BlockNames.THATCH_BLOCK, THATCH_BLOCK);
        registerBlock(BlockNames.THATCH_BLOCK_SLAB, THATCH_BLOCK_SLAB);
        registerBlock(BlockNames.THATCH_BLOCK_STAIRS, THATCH_BLOCK_STAIRS);
        registerWithTransparencyBlock(BlockNames.THATCH_BLOCK_ROOF, THATCH_BLOCK_ROOF);
        registerWithTransparencyBlock(BlockNames.THATCHED_OAK_SHINGLE, THATCHED_OAK_SHINGLE);
        registerBlock(BlockNames.GRASS_BALE, GRASS_BALE);
        registerBlock(BlockNames.STRAW_BLOCK, STRAW_BLOCK);
        registerBlock(BlockNames.HAY_PATH, HAY_PATH);
        registerBlock(BlockNames.STRAW_PATH, STRAW_PATH);
        registerBlock(BlockNames.THATCH_PATH, THATCH_PATH);

        // Concrete frames
        registerWithTransparencyBlock(BlockNames.OAK_CONCRETE_FRAME, OAK_CONCRETE_FRAME);
        registerWithTransparencyBlock(BlockNames.SPRUCE_CONCRETE_FRAME, SPRUCE_CONCRETE_FRAME);
        registerWithTransparencyBlock(BlockNames.DARK_OAK_CONCRETE_FRAME, DARK_OAK_CONCRETE_FRAME);
        registerWithTransparencyBlock(BlockNames.ACACIA_CONCRETE_FRAME, ACACIA_CONCRETE_FRAME);
        registerWithTransparencyBlock(BlockNames.JUNGLE_CONCRETE_FRAME, JUNGLE_CONCRETE_FRAME);
        registerWithTransparencyBlock(BlockNames.OAK_CONCRETE_CROSSED_FRAME, OAK_CONCRETE_CROSSED_FRAME);
        registerWithTransparencyBlock(BlockNames.SPRUCE_CONCRETE_CROSSED_FRAME, SPRUCE_CONCRETE_CROSSED_FRAME);
        registerWithTransparencyBlock(BlockNames.DARK_OAK_CONCRETE_CROSSED_FRAME, DARK_OAK_CONCRETE_CROSSED_FRAME);
        registerWithTransparencyBlock(BlockNames.ACACIA_CONCRETE_CROSSED_FRAME, ACACIA_CONCRETE_CROSSED_FRAME);
        registerWithTransparencyBlock(BlockNames.JUNGLE_CONCRETE_CROSSED_FRAME, JUNGLE_CONCRETE_CROSSED_FRAME);

        // Doors, traps etc..
        registerDoorBlock(BlockNames.IRON_BARS_DOOR, IRON_BARS_DOOR);

        // Tools blocks
        registerToolBlock(BlockNames.GLASSCUTTER, GLASSCUTTER);
    }
}
