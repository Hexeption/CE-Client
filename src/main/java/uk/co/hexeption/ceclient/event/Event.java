package uk.co.hexeption.ceclient.event;

import me.zero.alpine.event.EventState;

/**
 * Event
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 31/01/2020 - 10:42 am
 */
public class Event {

    private EventState eventState;

    public Event(EventState eventState) {
        this.eventState = eventState;
    }

    public EventState getEventState() {
        return eventState;
    }

    public void setEventState(EventState eventState) {
        this.eventState = eventState;
    }
}
