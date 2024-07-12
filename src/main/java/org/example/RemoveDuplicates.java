package org.example;

import java.util.*;

public class RemoveDuplicates {

    String ins = "Wonderful";
    public static void meth(){
        String str = "ThisiisSomething";
        char[] vh = str.toLowerCase().toCharArray();


        Set<Character> st = new LinkedHashSet<>();
        for(char chu : vh){
            st.add(chu);
        }

        System.out.println(st);
    }

     void methO(){
        List<String> lst = Arrays.asList(ins);
         System.out.println(lst);
         String[] lstO = lst.toArray(new String[0]);
         System.out.println(lst);


    }

    public static void main(String[] args) {
        meth();
        RemoveDuplicates obj = new RemoveDuplicates();
        obj.methO();
    }

}
