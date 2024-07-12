package org.example;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int[] lft = new int[arr.length];
        int[] rgt = new int[arr.length];

        lft[0] = 1;
        rgt[arr.length-1]=1;

        for(int i =1; i<arr.length;i++){
            lft[i] = lft[i-1]*arr[i-1];
        }

       /* right
                lft*right*/
    }
}
