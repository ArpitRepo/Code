package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoughWork {

    int b;
    static void meth(){
        char ch = ' ';
        String var ="adsjdhsdgahgdjaaaa";
        Map<Character, Integer> mp = new LinkedHashMap<>();
        int max=0;
        for(int i=0;i<var.length();i++){
            if(!mp.containsKey(var.charAt(i))){
                mp.put(var.charAt(i),mp.getOrDefault(var.charAt(i), 0) + 1);

if(var.charAt(i)>0){
    max= mp.get(var.charAt(i));
    ch = var.charAt(i);

}
            }


        }

        System.out.println(max);
    }

    public static void main(String[] args) {

       RoughWork.meth();
        String str = "Java";
        str.concat(" Programming");
        System.out.println(str); //returned only java becuase .concat is not assigned to any string var.
        RoughWork rW = new RoughWork();
        System.out.println(rW.b);

        int a =2;
        System.out.println(a/2);  //1
        System.out.println(a+2);  //4
        System.out.println(a+"Something");  //2Something

    }
}
