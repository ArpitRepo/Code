package org.example;

public class SimpleReverse {

    static void meth(){
        String var = "that is far";
        String res ="";
        for(int i =var.length()-1;i>=0;i--){
            res = res+var.charAt(i);
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        SimpleReverse.meth();
    }
}
