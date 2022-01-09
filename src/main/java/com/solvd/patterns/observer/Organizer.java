package com.solvd.patterns.observer;

public class Organizer implements EventObserver{
    @Override
    public void update(String message) {
        System.out.println("Organizer have to control " + message );
    }
}
