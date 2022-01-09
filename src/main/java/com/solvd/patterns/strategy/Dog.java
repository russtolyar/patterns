package com.solvd.patterns.strategy;

public class Dog implements FeedStrategy{
    @Override
    public void toEat() {
        System.out.println("Dog gnaws meat!");
    }
}
