package com.designpattern.adaptor2;

public class FamilyAdaptor implements Activities {
//Leverage the implementations of the other classes in place.
CustomerLogging cl = new CustomerLogging();


    @Override
    public void playlog(String str) {
        cl.pretty();
        cl.printMe(str);
        cl.pretty();
    }

    @Override
    public void dancelog(String str) {
        
    }

    @Override
    public void beHappylog(String Str) {
        
    }
    
}
