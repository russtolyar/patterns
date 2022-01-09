package com.solvd.patterns.strategy;

public class Kitty implements FeedStrategy{

    @Override
    public void toEat() {
        System.out.println("Kitty licks milk))!");
    }
}
