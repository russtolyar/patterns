package com.solvd.patterns.decorator;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.toSay();
        Animal angryDog = new AngryDog(dog);
        angryDog.toSay();
    }
}
