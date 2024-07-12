package org.example;

import java.util.*;

public class OptimizedRemovedDuplicates {

    static Set<String> removeDuplicated(String arr){

        String arr1[] = arr.split("");
        List<String> lst = Arrays.asList(arr1);
        Set<String> st = new LinkedHashSet<>(lst);
        return st;
    }
    public static void main(String[] args) {
        Set<String> val = OptimizedRemovedDuplicates.removeDuplicated("aaabbbttyufre");
        System.out.println(val);
    }
}
