package fr.slashandroses.mhcraft.registry;

import fr.slashandroses.mhcraft.MHConstants;
import fr.slashandroses.mhcraft.common.block.container.GlassCutterContainer;
import fr.slashandroses.mhcraft.common.screen.GlassCutterScreen;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

import static fr.slashandroses.mhcraft.MHCraft.registerScreen;

public class ContainerRegistry {

    public static ScreenHandlerType<GlassCutterContainer> GLASSCUTTER_CONTAINER = Registry.register(Registry.SCREEN_HANDLER, MHConstants.NAMESPACE, new ScreenHandlerType<>(GlassCutterContainer::new));

    public static void init() {
        registerScreen(GLASSCUTTER_CONTAINER, GlassCutterScreen::new);
    }
}
