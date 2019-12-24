package Guava;

import com.google.common.eventbus.EventBus;

public class Test {
    public static void main( String[] args ) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("tom");
    }
}
