package com.solvd.patterns.fasad;

public class Main {
    public static void main(String[] args) {

        Dress dress = new Dress();
        Hair hair = new Hair();
        MakeUp makeUp = new MakeUp();

        Bride myBride = new Bride(hair,makeUp,dress);

        myBride.serviceMyBride();

    }
}
