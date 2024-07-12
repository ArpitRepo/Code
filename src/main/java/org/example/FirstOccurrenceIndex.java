package org.example;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurrenceIndex {
    static void printIndex(String str, String s)
    {

        boolean flag = false;
        for (int i = 0; i < str.length() - s.length() + 1;i++) {
            if (str.substring(i, i + s.length()).equals(s)) {
                System.out.print(i + " ");
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("NONE");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String str1 = "GeeksforGeeks";
        String str2 = "Geeks";
        printIndex(str1, str2);

        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        System.out.println();
        System.out.println(lst.get(0));

    }
}
