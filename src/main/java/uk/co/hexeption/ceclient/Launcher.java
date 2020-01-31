package uk.co.hexeption.ceclient;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

/**
 * Launcher
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 09:41 am
 */
public class Launcher implements IMixinConnector {

    @Override
    public void connect() {
        Mixins.addConfiguration("mixins.ceclient.json");
    }
}
