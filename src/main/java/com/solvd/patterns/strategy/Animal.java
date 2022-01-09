package com.solvd.patterns.strategy;

public class Animal {

    private FeedStrategy feedStrategy;

    public Animal(FeedStrategy feedStrategy) {
        this.feedStrategy = feedStrategy;
    }
    public void toSay(){
        System.out.println("this animal can talk on it's own language");
    }
    public void startFeeding(){
        this.feedStrategy.toEat();
    }
}
