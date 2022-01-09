package com.solvd.patterns.builder;

public class Main {
    public static void main(String[] args) {

        Human human = new Human.Builder()
                .name("Vanya")
                .surname("Petrov")
                .nationality("Russian")
                .age(23)
                .hair("Green")
                .build();
        System.out.println(human);

    }
}
