package com.templatesDesignPattern;

// This as simple Abstract to enforce the sub-class
public abstract class CustomeCompiler {
    public final void  compileCode(){
        //concreate implementation

        listtheConfiguration();

        //list of methods that needed for the compilations of the source code.
        checkCodeinitiation();
        checkErrors();
        displayErrors();
        displayOutPut();
        endofOutput();

    }

    private void endofOutput() {
        System.out.println("************");
    }

    private void listtheConfiguration() {
        System.out.println("************");
        System.out.println("This is the implementation from the Abstract Class");
    }


    abstract void  displayOutPut();
    abstract void checkErrors();

    abstract void checkCodeinitiation();
    abstract void displayErrors();



}
