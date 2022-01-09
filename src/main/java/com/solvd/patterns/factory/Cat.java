package com.solvd.patterns.factory;

public class Cat implements AnimalImpl{
    @Override
    public void say() {
        System.out.println("Cat say - mjau!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat - milk!");
    }

    @Override
    public void play() {
        System.out.println("Cat play with mouse!");
    }
}
