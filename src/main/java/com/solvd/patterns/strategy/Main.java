package com.solvd.patterns.strategy;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal(new Dog());
        dog.startFeeding();
        Animal kitty = new Animal(new Kitty());
        kitty.startFeeding();
    }
}
