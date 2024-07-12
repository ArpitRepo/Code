package org.example;

import java.util.*;

public class Code {

    void meth(){


            System.out.println();


    }


    void checkLength(){
        String s = "Something to Check";
        String[] k = s.split(" ");
        int n = s.length();
        int l = k.length;
StringBuffer sB = new StringBuffer(s.length());

String jkl ="";



        System.out.println(jkl);

        for(int t = n-1; t>=0; t--){
            sB.append(s.charAt(t));
        }

        System.out.println(sB);


        Map<String, Integer> mp = new HashMap<>();
        mp.put("Arpit Sharma", 1);
        mp.put("Anil Kumar Sharma", 2);
       for( Map.Entry<String, Integer> mps : mp.entrySet()){
           System.out.println(mps.getKey() + " " + mps.getValue());

       }

       if(mp.containsKey("Anil Kumar Sharma")){
           System.out.println("I am winning");
       }

       int m = mp.size();

       List<String> lk = new ArrayList<>();
       lk.add("hello");
       lk.add("hi");

       int j = lk.size();

       Set<String> st = new TreeSet<>();
       st.add("Hello");

       int stn = st.size();




    }

    public static void main(String[] args) {
        Code obj = new Code();
        obj.meth();
        obj.checkLength();
    }
}
