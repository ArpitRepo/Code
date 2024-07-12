package org.example;

public class intReverse {


    void meth(){

    }

    public static void main(String[] args) {
        int in = 121;
StringBuilder sb = new StringBuilder();
       String str = String.valueOf(in);
       char str1 = 0;
       for(int i = str.length()-1; i>=0; i--){
              sb.append(str.charAt(i));
        }

        System.out.println(sb);

        if(str.equalsIgnoreCase(sb.toString())){
            System.out.println("Palimdrome");
        }
    }


}
