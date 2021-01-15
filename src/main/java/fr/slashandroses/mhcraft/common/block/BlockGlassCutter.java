package fr.slashandroses.mhcraft.common.block;

import fr.slashandroses.mhcraft.common.block.container.GlassCutterContainer;
import net.minecraft.block.BlockState;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BlockGlassCutter extends StonecutterBlock {
    private static final Text TITLE = new TranslatableText("menu.mhcraft.glasscutter");

    public BlockGlassCutter(Settings settings) {
        super(settings);
        this.setDefaultState((this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
            player.incrementStat(getGlassCutterIdentifier());
            return ActionResult.CONSUME;
        }
    }

    @NotNull
    private Identifier getGlassCutterIdentifier() {
        Identifier identifier = new Identifier("interact_with_glasscutter");
        Registry.register(Registry.CUSTOM_STAT, "interact_with_glasscutter", identifier);
        Stats.CUSTOM.getOrCreateStat(identifier, StatFormatter.DEFAULT);
        return identifier;
    }

    @Nullable
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((i, playerInventory, playerEntity) -> new GlassCutterContainer(i, playerInventory, ScreenHandlerContext.create(world, pos)), TITLE);
    }
}
