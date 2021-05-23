package com.designpattern.adaptor;

public class Shcool {
    /** This is simple school work */
   public static void main(String[] args) {
    //Create the instance of the adaptor
    
    Pen pa= new PenAdaptor();
    
    // Do the home work here
    Assignment scienceHW = new Assignment();
    scienceHW.setP(pa);
    scienceHW.write("Writing my Assignments!!");

   }
}
