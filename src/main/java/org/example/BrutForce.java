package org.example;

public class BrutForce {

    public static void main(String[] args) {

        int[] in = {1,2,2,3,4,5};
        int[] ki = new int[in.length];
        int fi =1;
        for(int i =0; i<in.length;i++){
          fi= fi *in[i];

        }

        for(int i =0; i<ki.length;i++){
            ki[i]= fi/in[i];
            System.out.print("Different " +ki[i]);

        }
        System.out.println(fi);

        System.out.println();

        for(int i =0; i<in.length;i++){
            for(int j =i+1; j<in.length;j++){
             if(in[i]==in[j]){
                 System.out.println("Duplicate :- " +in[i]);
             }

            }

        }

    }
}
