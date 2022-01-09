package com.solvd.patterns.factory;

public class Dog implements AnimalImpl{
    @Override
    public void say() {
        System.out.println("Dog say - GAUU!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat - meat!");
    }

    @Override
    public void play() {
        System.out.println("Dog play with branch!");
    }
}
