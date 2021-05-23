package com.designpattern.adaptor;

/** this is assignment class */
public class Assignment  {
    Pen p;

    public void doHomework(){
        System.out.println("Writing home work");
    }

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void write(String str) {
     p.write(str);
    }
}
