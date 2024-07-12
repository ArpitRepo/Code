package org.example;

public class RotateAnArray {

    public static void main(String[] args) {

re();



    }


    static String  rev(String rev){
 StringBuilder sb = new StringBuilder();
String res = sb.append(rev).reverse().toString();
return res;
    }

    static void re(){
        String att = "Somethingtoreverse";
        String[] a = att.split("");

        int n=3;

        int rem = att.length()-n;
        StringBuilder sb = new StringBuilder();


         String v = rev(att);
         String o = rev(v.substring(0,n));
         String t  = rev(v.substring(n,att.length()));

         sb.append(o).append(t);
        System.out.print(sb);


    }


}
