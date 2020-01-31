package uk.co.hexeption.ceclient.event.events.input;

import me.zero.alpine.event.EventState;
import uk.co.hexeption.ceclient.event.Event;

/**
 * EventKeyPressed
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 10:43 am
 */
public class EventKeyPressed extends Event {

    private int key;
    private int scanCode;

    public EventKeyPressed(EventState eventState, int key, int scanCode) {
        super(eventState);
        this.key = key;
        this.scanCode = scanCode;
    }

    public int getKey() {
        return key;
    }

    public int getScanCode() {
        return scanCode;
    }
}
