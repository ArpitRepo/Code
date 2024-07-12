package org.example;

public class StringChar {


    public static void main(String[] args) {
        String a = "Hello";
        String b = a.toLowerCase();
        System.out.println(b);
        char i = a.charAt(0);
        char h = Character.toLowerCase(i);
        System.out.println(h);


        for (int k = 0; k<a.length();k++){


            if(Character.isLowerCase(a.charAt(k))){
                System.out.println(a.charAt(k));
            }
        }
    }
}
