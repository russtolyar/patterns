package com.solvd.patterns.observer;

public class ServiceTeam implements EventObserver{
    @Override
    public void update(String message) {
        System.out.println("Service Team should extremely do " + message);
    }
}
