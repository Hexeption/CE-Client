package uk.co.hexeption.ceclient.event.events.screen;

import me.zero.alpine.event.EventState;
import uk.co.hexeption.ceclient.event.Event;

/**
 * EventRender2D
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 04:47 pm
 */
public class EventRender2D extends Event {

    private final int width;
    private final int height;

    public EventRender2D(EventState eventState, int width, int height) {
        super(eventState);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
