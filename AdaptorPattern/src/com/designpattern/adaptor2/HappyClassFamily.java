package com.designpattern.adaptor2;

public class HappyClassFamily {
    //simple class for example for the happy family

    public static void main(String[] args) {
        //what family do? 
        //be happy and cool.
        Activities fa = new FamilyAdaptor();
       fa.playlog("Super");


    }
}
