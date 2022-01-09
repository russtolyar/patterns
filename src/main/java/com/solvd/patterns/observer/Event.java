package com.solvd.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private List<String> states;
    private List<EventObserver> controlTasks;

    public Event() {
        states = new ArrayList<>();
        controlTasks = new ArrayList<>();
    }

    public void addControlTask(EventObserver controlTask) {
        controlTasks.add(controlTask);
    }

    public void removeControlTask(EventObserver controlTask) {
        controlTasks.remove(controlTask);
    }

    public void notifyControlTasks(String state) {
        for (EventObserver observer : controlTasks){
            observer.update(state);
        }
    }

    public void addState(String state){
        states.add(state);
        notifyControlTasks(state);
    }


}
