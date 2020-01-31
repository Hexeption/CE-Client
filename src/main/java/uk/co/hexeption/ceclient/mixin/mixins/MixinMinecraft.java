package uk.co.hexeption.ceclient.mixin.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * MixinMinecraft
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 09:47 am
 */
@Mixin(Minecraft.class)
public class MixinMinecraft {

    @Inject(method = "run", at = @At(value = "HEAD"))
    private void startClient(CallbackInfo ci) {
        System.out.println("Starting Client?");
    }
}
