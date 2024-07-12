package org.example;

import java.util.*;

public class Algo {


    String str = "This is something";
    String strArr[] = {"This is something", "to be", "altered"};
    char ch = 'a';
    static String var = "static var";

    void meth() {
        System.out.println(var);

        Map<Integer, String> mp = new HashMap<>();
        String st2 = "abcde";
        String str3 = "edcba";
        char[] ch1 = st2.toCharArray();
        char[] ch3 = str3.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch3);
        if (Arrays.equals(ch1, ch3)) {
            System.out.println("Both strings are anagram");
        } else {
            System.out.println("Both strings are not anagram");
        }

    }

    void reverse() {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        System.out.println("Reversed string " + res);
    }

    void reversingAtATime() {
        String[] newStr = str.split(" ");
        String res = "";
        String result = "";
        for (int i = 0; i < newStr.length; i++) {
            for (int j = newStr.length; i >= 0; i--) {
                res = res + newStr[i].charAt(j);
            }
            result = res + " ";
        }
        System.out.println("Reversed words " + result);
    }

    void reversingWordInString() {
        String res = "";
        String[] newStr = str.split(" ");
        for (int i = 0; i < newStr.length; i++) {
            for (int j = newStr[i].length() - 1; j >= 0; j--) {
                res = res + newStr[i].charAt(j);
            }
            res = res + " ";
        }
        System.out.println(res);
    }

    static void statc() {
        // static String k = "";
    }

    void secondGreatestNo() {
        int[] arr = {1, 4, 2, 8, 4, 7, 2, 8, 1};
        Integer[] intarr = new Integer[arr.length];
        for (int i = 0; i < intarr.length; i++) {
            intarr[i] = Integer.valueOf(arr[i]);
        }
        System.out.println(intarr);

        Set<Integer> st = new TreeSet<>();
        for (int k : arr) {
            st.add(k);
        }
        int no = st.size() - 1;
        Integer[] str = st.toArray(new Integer[st.size()]);
        ;
        int num = str.length - 2;

        // System.out.println(st[no]);
        System.out.println(str[num] + " Second highest number after removing duplicates");
        List<Integer> lst = Arrays.asList(intarr);
        Collections.sort(lst);
        int j = lst.size() - 2;
        //System.out.println(lst(lst.size()-2));
        System.out.println(lst.get(2));

        System.out.println(j);


    }

    void maxRepeatingChar() {
        String str = "dgshdgsjduysgyayewkggfdghghghjgjhgjh";
        int mx = -1;
        char result = 0;
        int[] count = new int[122];
        for (int i = 0; i < str.length(); i++) {

            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {

            if (mx < str.charAt(i)) {
                mx = str.charAt(i);
                result = str.charAt(i);

            }
        }

        System.out.println(result);

    }

    void defaultValue() {
      /*  int num;
        String str;

            System.out.println(num);*/

        char ch = 'a';
        String str = "dsds";
        char chf = str.charAt(2);
        int c = ch;
        System.out.println(c);
    }

    void maxNi() {
        int[] jt = {1, 5, 4, 3, 2, 1, 7, 9, 7};
        int max = 0;
        for (int i = 0; i < jt.length; i++) {
            if (max < jt[i]) {
                max = jt[i];
            }
        }
        System.out.println(max);
    }

    void ms(){
        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"sds");
        mp.put(2,"sds");
        mp.put(3,"sdds");

        System.out.println(mp);
    }
    public static void main(String[] args) {
        Algo alg = new Algo();
        alg.maxRepeatingChar();
        /*alg.reverse();
        // alg.reversingAtATime();
        alg.secondGreatestNo();*/
    }

}
