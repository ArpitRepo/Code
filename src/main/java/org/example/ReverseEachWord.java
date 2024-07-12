package org.example;

public class ReverseEachWord {

    static void reverse(){
        String st ="This is something";
        String[] st1 =st.split(" ");
        String rev = "";
        String res = "";
        for(int i=0;i<st1.length;i++){
            int l=st1[i].length()-1;
            char[] hj = st1[i].toCharArray();
            for(int j=hj.length-1;j>=0;j--){
                rev = rev +hj[j];
            }
            res = res + rev + " ";
            rev="";

        }
        System.out.println("reverse word is " +res);
    }

    public static void main(String[] args) {
        ReverseEachWord.reverse();
    }
}
