package uk.co.hexeption.ceclient.mixin.mixins;

import me.zero.alpine.event.EventState;
import net.minecraft.client.KeyboardListener;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import uk.co.hexeption.ceclient.Ceclient;
import uk.co.hexeption.ceclient.event.events.input.EventKeyPressed;

/**
 * MixinKeyboardListener
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 10:44 am
 */
@Mixin(KeyboardListener.class)
public class MixinKeyboardListener {

    @Inject(method = "onKeyEvent", at = @At("HEAD"))
    public void onKeyEvent(long windowPointer, int key, int scanCode, int action, int modifiers, CallbackInfo ci) {
        if (action == GLFW.GLFW_PRESS) {
            Ceclient.INSTANCE.eventBus.post(new EventKeyPressed(EventState.POST, key, scanCode));
        }
    }

}
