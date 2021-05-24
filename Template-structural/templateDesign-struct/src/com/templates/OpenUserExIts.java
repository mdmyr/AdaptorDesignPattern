package com.templates;

public class OpenUserExIts extends BuildSiperianConnection{

    private String dBname="Custom DB";
    private String connectionObj="Custom Connection";

    @Override
    void setDBProperties(String DBname) {
    System.out.println("Form OPENUE ");
    System.out.println(dBname);
        
    }

    @Override
    void setConnectionProperites(String ConnectionObj) {
        connectionObj = ConnectionObj;
        System.out.println("Form OPENUE ");
        System.out.println(connectionObj);
        
    }
    
}
