package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharater {




    public void check(){


        String str = "Thisissomethingsomething";
        StringBuilder sB = new StringBuilder();
        for(int i=0;i<str.length();i++){
            sB.append(str.charAt(i)) ;
        }

        System.out.println(sB.toString());
    }
    public static void main(String[] args) {
//INCORRECT LOGIC
        String str = "abcabcbbd";
        Set<String> st = new LinkedHashSet<>();
        for(int i=0; i<str.length();i++){
            st.add(String.valueOf(str.charAt(i)));



        }
        System.out.println(st);

        StringBuilder sb = new StringBuilder();

        for(String sbj :st){
            sb.append(sbj);
        }

        System.out.println(sb);

        LongestSubstringWithoutRepeatingCharater ls = new LongestSubstringWithoutRepeatingCharater();
        ls.check();
    }
}
