package fr.slashandroses.mhcraft.mixin;

import fr.slashandroses.mhcraft.MHConstants;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.File;
import java.io.FileInputStream;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen {

    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @ModifyArg(
            method="render(Lnet/minecraft/client/util/math/MatrixStack;IIF)V",
            at=@At(
                    value="INVOKE",
                    target="Lnet/minecraft/client/gui/screen/TitleScreen;drawCenteredString(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)V",
                    ordinal = 0
            ))
    private String removeSplashText(String splash) {
        return "";
    }

    @ModifyArg(
            method="render(Lnet/minecraft/client/util/math/MatrixStack;IIF)V",
            at=@At(
                    value="INVOKE",
                    target="Lnet/minecraft/client/gui/screen/TitleScreen;drawStringWithShadow(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)V",
                    ordinal = 0
            ))
    private String changeVersion(String splash) {
        return "Minecraft 1.16.4 - MHCraft 1.2.0";
    }

    @ModifyArg(
            method="render(Lnet/minecraft/client/util/math/MatrixStack;IIF)V",
            at=@At(
                    value="INVOKE",
                    target="Lnet/minecraft/client/texture/TextureManager;bindTexture(Lnet/minecraft/util/Identifier;)V",
                    ordinal = 2
            ))
    private Identifier setMarxistHustlersEdition(Identifier id) {
        return new Identifier(MHConstants.NAMESPACE,"textures/logo.png");
    }
}
