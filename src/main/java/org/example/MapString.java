package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapString {

    public static void main(String[] args) {
        String  in = "thisissomething";
        String[] a =in.split("");
        System.out.println(a);
        List<String> l = Arrays.asList(a);
        System.out.println("List " +l);
        StringBuilder sB = new StringBuilder();

        System.out.println();
        System.out.println();

        //character with occurrence
        Map<Character, Integer> m =
                new HashMap<>();

        for (int i =0; i<in.length();i++){
            if(m.containsKey(in.charAt(i))){

                m.put(in.charAt(i), m.get(in.charAt(i)) +1);
            }else{
            m.put(in.charAt(i), 1);}
        }

        System.out.println(m);

        //printing only the dublicates
        for (Map.Entry<Character, Integer> mE : m.entrySet()){
            if(mE.getValue()>1){
                System.out.print(mE.getKey() + " ");
            }


        }

        System.out.println();
        System.out.println();

        //printing the value without the duplicates
        for (Map.Entry<Character, Integer> mE : m.entrySet()){
            if(mE.getValue()<2){
                System.out.print(mE.getKey() + " ");
            }


        }

    }


}
