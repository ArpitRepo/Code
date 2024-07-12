package org.example;

import java.util.*;

public class AlgoTwo {

    int[] n = {1,4,3,2,5,2,5,2};

    void meth(){
        Set<Integer> st = new TreeSet<>();

        for(int k :n){
        st.add(k);
        }

        System.out.println(st);

    }
    public static void main(String[] args) {
        AlgoTwo aT = new AlgoTwo();

    }


}
