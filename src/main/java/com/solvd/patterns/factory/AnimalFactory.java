package com.solvd.patterns.factory;

public class AnimalFactory {
    public static AnimalImpl creat (Animals anim){
        AnimalImpl animal = null;

        switch (anim){
            case CAT:
                animal = new Cat();
                break;
            case DOG:
                animal = new Dog();
                break;
            default:
                break;
        }
        return animal;
    }
}
