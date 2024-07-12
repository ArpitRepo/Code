package org.example;

import java.util.*;

public class StringHashSet {

    static void meth(){
        String var = "Something";
        String[] ano = var.split("");
        Set<String> st = new HashSet<>(Arrays.asList(ano));
        Set<Character> hg = new HashSet<>();
        System.out.println(st);
        for(char j : var.toCharArray()){
            hg.add(j);
        }
        System.out.println();
        System.out.println(hg);

String res ="";
String result="";
        String dub = "This This is is something";
        String[] gh = dub.split(" ");
        Set<String> gt = new HashSet<>(Arrays.asList(gh));
        System.out.println(gt);
        for(String j:gt){
            res = res + j;
            result =result+ res+ " ";
            res="";
        }

        System.out.println(result);

    }

static void meth2(){
        String s = "dsaddsada" ;
        String[] meth =s.split("");
        List<String> lst = new ArrayList<>();
        for(String k: meth){
            lst.add(k);
        }
    System.out.println(lst);
}
    public static void main(String[] args) {
meth2();
    }
}
