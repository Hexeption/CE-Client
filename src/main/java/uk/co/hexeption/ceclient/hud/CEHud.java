package uk.co.hexeption.ceclient.hud;

import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import uk.co.hexeption.ceclient.Ceclient;
import uk.co.hexeption.ceclient.ClientInfo;
import uk.co.hexeption.ceclient.IMC;
import uk.co.hexeption.ceclient.event.events.screen.EventRender2D;

/**
 * CEHud
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 04:59 pm
 */
public class CEHud implements Listenable, IMC {

    @EventHandler
    private Listener<EventRender2D> eventRender2DListener = new Listener<>(event -> {
        if (mc.gameSettings.showDebugInfo) {
            return;
        }

        Ceclient.INSTANCE.fontManager.hud.drawStringWithShadow(ClientInfo.MOD_NAME, 5, 5, -1);

        // TODO: 31/01/2020 Add Mod List
    });

    public abstract static class ModList {

        public enum Colour {
            CATEGORY("Category"),
            RANDOM("Random"),
            RAINBOW("Rainbow"),
            SOLID("Solid");

            String name;

            Colour(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }


            @Override
            public String toString() {
                return name;
            }
        }

        public enum Position {
            TOPLEFT("Top Left"),
            TOPRIGHT("Top Right"),
            BOTTOMLEFT("Bottom Left"),
            BOTTOMRIGHT("Bottom Right");

            String name;

            Position(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return name;
            }
        }

        public enum Sort {
            CATEGORY("Category"),
            LENGTH("Length"),
            ALPHABETICAL("Alphabetical");
            String name;

            Sort(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return name;
            }
        }
    }

}
