package com.solvd.patterns.fasad;

public class Dress {

    public Boolean checkSize(Integer size) {
        Integer brideSize = 46;
        return brideSize == size;
    }
    public void putDressOn(){
        System.out.println("Wedding dress is Put on to the bride!");
    }
}
