package com.solvd.patterns.observer;

public class Main {
    public static void main(String[] args) {

        Organizer organizer = new Organizer();
        ServiceTeam serviceTeam = new ServiceTeam();

        Event event = new Event();
        event.addControlTask(organizer);
        event.addControlTask(serviceTeam);

        event.addState("turnOn the soft Music");
    }
}
