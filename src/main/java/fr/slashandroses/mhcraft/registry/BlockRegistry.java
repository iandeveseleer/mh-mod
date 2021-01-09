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
    public static Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block FLINT_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.GRAY).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SUGAR_BLOCK = new FallingBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).breakByHand(true).strength(0.8F, 0.8F).sounds(BlockSoundGroup.SAND));
    public static Block SUGAR_CANE_BLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).breakByHand(true).strength(1.5F, 0.8F).sounds(BlockSoundGroup.GRASS));
    public static Block GLOWSTONE_LAMP = new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).luminance(15).sounds(BlockSoundGroup.METAL));
    public static Block PURE_GLOWSTONE = new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.SAND).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).luminance(15).sounds(BlockSoundGroup.GLASS));
    public static Block PURE_GLOWSTONE_LAMP = new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).luminance(15).sounds(BlockSoundGroup.METAL));
    public static Block SLATE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BLACK).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SLATE_STAIRS = new BlockStairs(SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copy(SLATE_BLOCK));
    //    public static Block SLATE_ROOF = new BlockRoof(SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copy(SLATE_BLOCK));
    public static Block SLATE_SLAB = new BlockSlab(FabricBlockSettings.copy(SLATE_BLOCK));
    public static Block RED_SLATE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.RED).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block RED_SLATE_STAIRS = new BlockStairs(RED_SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copy(RED_SLATE_BLOCK));
    //    public static Block RED_SLATE_ROOF = new BlockRoof(RED_SLATE_BLOCK.getDefaultState(), FabricBlockSettings.copy(RED_SLATE_BLOCK));
    public static Block RED_SLATE_SLAB = new BlockSlab(FabricBlockSettings.copy(RED_SLATE_BLOCK));
    public static Block GRAY_BRICKS = new Block(FabricBlockSettings.of(Material.REDSTONE_LAMP, MaterialColor.GRAY).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block GRAY_BRICKS_STAIRS = new BlockRoof(GRAY_BRICKS.getDefaultState(), FabricBlockSettings.copy(GRAY_BRICKS));
    public static Block GRAY_BRICKS_SLAB = new BlockSlab(FabricBlockSettings.copy(GRAY_BRICKS));
    public static Block GRAY_BRICKS_WALL = new BlockWall(FabricBlockSettings.copy(GRAY_BRICKS));

    // Concrete frames
    public static Block OAK_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SPRUCE_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block DARK_OAK_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block ACACIA_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block JUNGLE_CONCRETE_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block OAK_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block SPRUCE_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block DARK_OAK_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block ACACIA_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));
    public static Block JUNGLE_CONCRETE_CROSSED_FRAME = new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.WHITE).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));


    // Doors, traps etc..
    public static Block IRON_BARS_DOOR = new BlockDoor(FabricBlockSettings.of(Material.METAL, MaterialColor.BLACK).breakByHand(true).breakByTool(FabricToolTags.PICKAXES).strength(1.5F, 6.0F).sounds(BlockSoundGroup.METAL));

    //Plants and Crops
    public static Block MARIJUANA_CROP = new VegetableBlock(FabricBlockSettings.of(Material.PLANT, MaterialColor.GRASS).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static void init() {
        registerBlock(BlockNames.CHARCOAL_BLOCK, CHARCOAL_BLOCK);
        registerBlock(BlockNames.FLINT_BLOCK, FLINT_BLOCK);
        registerBlock(BlockNames.SUGAR_BLOCK, SUGAR_BLOCK);
        registerBlock(BlockNames.SUGAR_CANE_BLOCK, SUGAR_CANE_BLOCK);
        registerBlock(BlockNames.GLOWSTONE_LAMP, GLOWSTONE_LAMP);
        registerBlock(BlockNames.PURE_GLOWSTONE, PURE_GLOWSTONE);
        registerBlock(BlockNames.PURE_GLOWSTONE_LAMP, PURE_GLOWSTONE_LAMP);
        registerBlock(BlockNames.SLATE_BLOCK, SLATE_BLOCK);
        registerBlock(BlockNames.SLATE_STAIRS, SLATE_STAIRS);
//        registerBlock(BlockNames.SLATE_ROOF, SLATE_ROOF);
        registerBlock(BlockNames.SLATE_SLAB, SLATE_SLAB);
        registerBlock(BlockNames.RED_SLATE_BLOCK, RED_SLATE_BLOCK);
        registerBlock(BlockNames.RED_SLATE_STAIRS, RED_SLATE_STAIRS);
//        registerBlock(BlockNames.RED_SLATE_ROOF, RED_SLATE_ROOF);
        registerBlock(BlockNames.RED_SLATE_SLAB, RED_SLATE_SLAB);
        registerBlock(BlockNames.GRAY_BRICKS, GRAY_BRICKS);
        registerBlock(BlockNames.GRAY_BRICKS_STAIRS, GRAY_BRICKS_STAIRS);
        registerBlock(BlockNames.GRAY_BRICKS_SLAB, GRAY_BRICKS_SLAB);
        registerBlock(BlockNames.GRAY_BRICKS_WALL, GRAY_BRICKS_WALL);
        registerCropBlock(BlockNames.MARIJUANA_CROP, MARIJUANA_CROP);

        // Concrete frames
        registerBlock(BlockNames.OAK_CONCRETE_FRAME, OAK_CONCRETE_FRAME);
        registerBlock(BlockNames.SPRUCE_CONCRETE_FRAME, SPRUCE_CONCRETE_FRAME);
        registerBlock(BlockNames.DARK_OAK_CONCRETE_FRAME, DARK_OAK_CONCRETE_FRAME);
        registerBlock(BlockNames.ACACIA_CONCRETE_FRAME, ACACIA_CONCRETE_FRAME);
        registerBlock(BlockNames.JUNGLE_CONCRETE_FRAME, JUNGLE_CONCRETE_FRAME);
        registerBlock(BlockNames.OAK_CONCRETE_CROSSED_FRAME, OAK_CONCRETE_CROSSED_FRAME);
        registerBlock(BlockNames.SPRUCE_CONCRETE_CROSSED_FRAME, SPRUCE_CONCRETE_CROSSED_FRAME);
        registerBlock(BlockNames.DARK_OAK_CONCRETE_CROSSED_FRAME, DARK_OAK_CONCRETE_CROSSED_FRAME);
        registerBlock(BlockNames.ACACIA_CONCRETE_CROSSED_FRAME, ACACIA_CONCRETE_CROSSED_FRAME);
        registerBlock(BlockNames.JUNGLE_CONCRETE_CROSSED_FRAME, JUNGLE_CONCRETE_CROSSED_FRAME);

        // Doors, traps etc..
        registerWithTransparencyBlocks(BlockNames.IRON_BARS_DOOR, IRON_BARS_DOOR);
    }
}