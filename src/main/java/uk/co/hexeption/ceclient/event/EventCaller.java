package uk.co.hexeption.ceclient.event;

import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import org.lwjgl.glfw.GLFW;
import uk.co.hexeption.ceclient.Ceclient;
import uk.co.hexeption.ceclient.event.events.input.EventKeyPressed;

/**
 * EventCaller
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 10:42 am
 */
public class EventCaller implements Listenable {

    @EventHandler
    private Listener<EventKeyPressed> eventKeyPressedListener = new Listener<>(event -> {
        Ceclient.LOGGER.info("Key Pressed: " + GLFW.glfwGetKeyName(event.getKey(), event.getScanCode()));
    });

}
