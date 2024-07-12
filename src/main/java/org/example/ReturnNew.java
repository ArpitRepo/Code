package org.example;

public class ReturnNew {

    static void meth(){

       if("a".equalsIgnoreCase("a")){
           return;
       }

       //Return statement will exit the method and sout will not be executed
        System.out.println("hello");

    }

    public static void main(String[] args) {

        ReturnNew.meth();

    }
}
