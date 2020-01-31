package uk.co.hexeption.ceclient.mixin.mixins;

import me.zero.alpine.event.EventState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.IngameGui;
import net.minecraftforge.client.gui.ForgeIngameGui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import uk.co.hexeption.ceclient.Ceclient;
import uk.co.hexeption.ceclient.event.events.screen.EventRender2D;

/**
 * MixinForgeIngameGui
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 04:48 pm
 */
@Mixin(ForgeIngameGui.class)
public class MixinForgeIngameGui extends IngameGui {

    public MixinForgeIngameGui(Minecraft p_i46325_1_) {
        super(p_i46325_1_);
    }

    @Inject(method = "renderGameOverlay", at = @At("HEAD"))
    private void renderGameOverlayPre(float partialTicks, CallbackInfo ci) {
        Ceclient.INSTANCE.eventBus.post(new EventRender2D(EventState.PRE, mc.getMainWindow().getScaledWidth(), mc.getMainWindow().getScaledHeight()));
    }

    @Inject(method = "renderGameOverlay", at = @At("RETURN"))
    private void renderGameOverlayPost(float partialTicks, CallbackInfo ci) {
        Ceclient.INSTANCE.eventBus.post(new EventRender2D(EventState.POST, mc.getMainWindow().getScaledWidth(), mc.getMainWindow().getScaledHeight()));
    }

}
