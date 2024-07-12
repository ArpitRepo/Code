package org.example;

public class Strings {

    static void conversion(){
        char c = 'J';
        int in = (int) c;
        String str = String.valueOf(c);
        String strOne = String.valueOf(in);
        int inOne = Integer.valueOf(strOne);
        char[] cOne = strOne.toCharArray();
        char cTwo =(char) in;

    }
    /*
    StringBuilder is generally faster than StringBuffer because it is not thread-safe. The lack of synchronization overhead makes StringBuilder more efficient in single-threaded scenarios.
StringBuffer is slightly slower due to the overhead of synchronization. However, this synchronization ensures that StringBuffer is safe to use in multi-threaded environments.
     */
    static void meth(){
        String str ="Something";
        char[] chr = str.toCharArray();
        StringBuilder sB = new StringBuilder();
        sB.append(str);
        sB.reverse();
        System.out.println(sB);

    }

    static void someMoreUnderstanding(){
        String var = "Something";
        String varTwo = var.toLowerCase();
        System.out.println(varTwo);
    }


    public static void main(String[] args) {
        //Strings.meth();
        someMoreUnderstanding();
    }
}
