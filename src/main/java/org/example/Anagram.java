package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

   static String words = "alice,bob,charlie"; String s = "abc";

   static String[] w = words.split(",");
   static StringBuilder h = new StringBuilder();
    static void m(){
        List<String> l = new ArrayList<>();
        for(int i =0; i<w.length; i++){
            char c = w[i].charAt(0);
            String n = String.valueOf(c);
l.add(n);
h.append(w[i].charAt(0));
w[i]=n;
        }

        System.out.println(l);
        System.out.println(h);
        System.out.println(Arrays.toString(w));
    }

    public static void main(String[] args) {
     m();
    }


}
