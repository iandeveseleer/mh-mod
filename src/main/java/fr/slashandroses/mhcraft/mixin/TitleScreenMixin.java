package fr.slashandroses.mhcraft.mixin;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import fr.slashandroses.mhcraft.MHConstants;
import fr.slashandroses.mhcraft.client.gui.RedButton;
import net.minecraft.client.gui.screen.ConnectScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerWarningScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.AbstractButtonWidget;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.network.MultiplayerServerListPinger;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.ServerAddress;
import net.minecraft.network.listener.ClientQueryPacketListener;
import net.minecraft.network.packet.c2s.query.QueryPingC2SPacket;
import net.minecraft.network.packet.s2c.query.QueryPongS2CPacket;
import net.minecraft.network.packet.s2c.query.QueryResponseS2CPacket;
import net.minecraft.server.ServerMetadata;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.apache.commons.lang3.ArrayUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Objects;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen {

    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @ModifyArg(
            method = "render(Lnet/minecraft/client/util/math/MatrixStack;IIF)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/screen/TitleScreen;drawCenteredString(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)V",
                    ordinal = 0
            ))
    private String removeSplashText(String splash) {
        return "";
    }


    @ModifyArg(
            method = "render(Lnet/minecraft/client/util/math/MatrixStack;IIF)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/texture/TextureManager;bindTexture(Lnet/minecraft/util/Identifier;)V",
                    ordinal = 2
            ))
    private Identifier setMarxistHustlersEdition(Identifier id) {
        return new Identifier(MHConstants.NAMESPACE, "textures/logo.png");
    }


    /**
     * BYTECODE : INVOKEVIRTUAL net/minecraft/client/gui/screen/TitleScreen.addButton (Lnet/minecraft/client/gui/widget/AbstractButtonWidget;)Lnet/minecraft/client/gui/widget/AbstractButtonWidget;
     *
     * @param button Red replacement button, with direct connection to MHCraft Server
     * @return
     */

    @ModifyArg(
            method = "initWidgetsNormal(II)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/screen/TitleScreen;addButton(Lnet/minecraft/client/gui/widget/AbstractButtonWidget;)Lnet/minecraft/client/gui/widget/AbstractButtonWidget;",
                    ordinal = 0
            ))
    private AbstractButtonWidget changeSoloButtonToMHButton(AbstractButtonWidget button) {
        ServerInfo serverInfo = new ServerInfo("MHCraft Serveur", "51.91.36.176:25612", false);
        return new RedButton(this.width / 2 - 100, this.height / 4 + 48, 200, 20, new TranslatableText(""), (buttonWidget) -> {
            this.client.openScreen(new ConnectScreen(this, this.client, serverInfo));
        }, ButtonWidget.EMPTY);
    }

    @ModifyArg(
            method = "initWidgetsNormal(II)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/screen/TitleScreen;addButton(Lnet/minecraft/client/gui/widget/AbstractButtonWidget;)Lnet/minecraft/client/gui/widget/AbstractButtonWidget;",
                    ordinal = 1
            ))
    private AbstractButtonWidget changeMPButtonToSoloButton(AbstractButtonWidget button) {

        return new ButtonWidget(this.width / 2 - 100, this.height / 4 + 48 + 24, 200, 20, new TranslatableText("menu.singleplayer"), (buttonWidget) -> {
            this.client.openScreen(new SelectWorldScreen(this));
        });
    }

    @ModifyArg(
            method = "initWidgetsNormal(II)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/screen/TitleScreen;addButton(Lnet/minecraft/client/gui/widget/AbstractButtonWidget;)Lnet/minecraft/client/gui/widget/AbstractButtonWidget;",
                    ordinal = 2
            ))
    private AbstractButtonWidget changeRealmsButtonToMPButton(AbstractButtonWidget button) {
        return new ButtonWidget(this.width / 2 - 100, this.height / 4 + 48 + 24 * 2, 200, 20, new TranslatableText("menu.multiplayer"), (buttonWidget) -> {
            Screen screen = this.client.options.skipMultiplayerWarning ? new MultiplayerScreen(this) : new MultiplayerWarningScreen(this);
            this.client.openScreen(screen);
        }, ButtonWidget.EMPTY);
    }
}
