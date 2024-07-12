package org.example;

import java.util.*;

public class Understanding  implements Comparable<Understanding> {
    int rollno;
    String name;
    int age;
//    Understanding(int rollno,String name,int age){
//        this.rollno=rollno;
//        this.name=name;
//        this.age=age;
//    }
    public int compareTo(Understanding st){

        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }

    public void someSorting(){
        int[] ul = {0,0,2,3,4,5,2,3,3,4,4};
        Set<Integer> st = new TreeSet<>();
        for (int k : ul){
            st.add(k);
        }
        System.out.println(st);


        List<Integer> lst = new ArrayList<>();
        for (int ka : ul){
            lst.add(ka);
        }
        Collections.sort(lst);
        System.out.println("sorted list" + lst);

    }
    public static void main(String args[]) {

//String[] str = {"Something", "we", "excellance"};
//        int[] arr = {3,4,6,8};
//List<String> lst = Arrays.asList(str);
//        System.out.println(lst);

        Understanding un = new Understanding();
        un.someSorting();




    }
}
