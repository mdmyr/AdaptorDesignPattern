package com.templatesDesignPattern;

/**Android */
public class AndroidCompiler extends CustomeCompiler{

    @Override
    void displayOutPut() {
        System.out.println("This is the android compiling the display");
        
    }

    @Override
    void checkErrors() {
        // TODO Auto-generated method stub
        System.out.println("This is android check errors");
        
    }

    @Override
    void checkCodeinitiation() {
        // TODO Auto-generated method stub
        System.out.println("Check the code intitialtion ");
        
    }

    @Override
    void displayErrors() {
        // TODO Auto-generated method stub
        
        System.out.println("Display erorrs");
    }


    
}
