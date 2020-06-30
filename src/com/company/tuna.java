package com.company;

public class tuna {
    private String carName;

    public tuna(String name){
        carName = name;
    }
    public void setName(String name){
        carName = name;
    }
    public String getName(){
        return carName;
    }
    public void saying(){
        System.out.printf("Your first car was %s\n", getName());
    }
}
