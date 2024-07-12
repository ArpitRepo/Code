package org.example;

public class staticUnder {
    static int var =  5;
int b =10;
    static void meth() {
        int y =9;
        System.out.println(var);

        y++;

        //System.out.println(b); YOU CAN'T access non static instance variable inside static method
        System.out.println(y);
    }

    public static void main(String[] args) {
        staticUnder.meth();
    }
}
