package org.example;

public class OVERRIDING {

    int var =5;
    int j;
    OVERRIDING(int j){
        this.j=j;
    }

     void m(){
        System.out.println("hello");
    }
}

class B extends OVERRIDING{

    B(){
        super(90);
        System.out.println(j);
        System.out.println("something: "+super.var);
    }
     void m(){
        System.out.println("hello");
    }
}

class mains{
    public static void main(String[] args) {
        B obj = new B();
        obj.m();
        OVERRIDING bb= new B();
        bb.m();

    }
}