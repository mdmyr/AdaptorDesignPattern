package com.designpattern.adaptor;

public class PenAdaptor implements Pen {

    @Override
    public void write(String str) {
        
        PilotPen pp = new PilotPen();
        //using the pilot pen as adaptor
        pp.writing(str);

    }
    
}
