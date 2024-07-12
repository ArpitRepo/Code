package org.example;

/*
Input: haystack = "sadbutsad", needle = "sad"
 */
public class FirstOccurance {
    String haystack = "sadbutsad";
    String needle = "sad";

     void m(){
         int l1 = haystack.length();
        int l2 = needle.length();


        for(int i=0;i<=l1-l2;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+needle.length()).equalsIgnoreCase(needle)){
                    System.out.println(haystack.substring(i,i+needle.length()));
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        FirstOccurance o = new FirstOccurance();
        o.m();
    }
}
