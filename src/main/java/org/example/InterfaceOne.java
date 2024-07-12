package org.example;

public interface InterfaceOne {

    void abc();
    default void meth(){
        System.out.println("Interface One");
    }
}
