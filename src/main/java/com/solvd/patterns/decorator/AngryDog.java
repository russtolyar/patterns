package com.solvd.patterns.decorator;

public class AngryDog implements Animal {

    private Animal animal;

    public AngryDog(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void toSay() {
        System.out.println("Angry Dog say - Haw-Haw-Haw!!!");
    }
}
