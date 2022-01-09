package com.solvd.patterns.decorator;

public class Dog implements Animal{
    @Override
    public void toSay() {
        System.out.println("doggy gratefully say - Aph-aph");
    }
}
