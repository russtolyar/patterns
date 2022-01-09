package com.solvd.patterns.factory;

public class Main {
    public static void main(String[] args) {

        AnimalImpl animal1 = AnimalFactory.creat(Animals.CAT);
        animal1.eat();

        AnimalImpl animal2 = AnimalFactory.creat(Animals.DOG);
        animal2.say();
        animal2.play();

    }
}
