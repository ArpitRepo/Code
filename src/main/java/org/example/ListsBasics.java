package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsBasics {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        String[] str = {"abc","def","ghi","jkl"};
        lst = Arrays.asList(str);
        System.out.println(lst);
        String[] strConv = null;
        System.out.println(strConv);

        strConv= lst.toArray(new String[0]);
        for(int i=0; i<lst.size();i++){
            strConv[i] =lst.get(i);
        }
        //Pls check below
        System.out.println(Arrays.toString(strConv));
    }
}
