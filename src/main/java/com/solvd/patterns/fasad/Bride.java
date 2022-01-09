package com.solvd.patterns.fasad;

public class Bride {

    private final Hair hair;
    private final MakeUp makeUp;
    private final Dress dress;

    public Bride(Hair hair, MakeUp makeUp, Dress dress) {
        this.hair = hair;
        this.makeUp = makeUp;
        this.dress = dress;
    }

    public void serviceMyBride(){
        int  brideSize = 46;
        if(dress.checkSize(brideSize)){
            dress.putDressOn();
            hair.doHair();
            makeUp.doMakeUp();
        } else {
            System.out.println("Wrong choice of Bride!)) ");
        }
    }
}
