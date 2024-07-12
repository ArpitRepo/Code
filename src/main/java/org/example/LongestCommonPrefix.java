package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String commonPrefix(){
        String[] com = {"geek","geekforgeek","geezer"};

        StringBuilder sB = new StringBuilder();

        Arrays.sort(com);

        System.out.println(com);

        char[] ch1 = com[0].toCharArray();
        char[] ch2 = com[com.length-1].toCharArray();

        for(int i=0;i<ch1.length;i++){
            if(!(ch1[i] ==ch2[i])){
break;
            }
            sB.append(ch1[i]);
        }
        return sB.toString();

    }
    public static void main(String[] args) {
        LongestCommonPrefix lCP = new LongestCommonPrefix();
      String var = lCP.commonPrefix();
        System.out.println(var);
    }
}
