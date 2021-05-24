package com.templates;
/**Simple template for the siperian connection initiator */
public abstract class BuildSiperianConnection {

    public void createSiperianConn() {
        setConnectionProperites();
        setDBProperties();

        setDBProperties();
        setConnectionProperites("custome");
    }

    private void setDBProperties() {
        System.out.println("****2***");
        System.out.println("setting default db");
    }


    private void setConnectionProperites() {

        System.out.println("****1****");
        System.out.println("settting default connection props");
    }

    abstract void setDBProperties(String DBname);
    abstract void setConnectionProperites(String ConnectionObj);
}