package org.example;

import java.util.Arrays;

public class MoveZerosAtEnd {


    static int[] move(){
        int[] arr = {7,8,9,0,0,5};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
            j++;
            }

        }

        while(j<arr.length){
            arr[j]=0;
            j++;


        }
        return arr;
    }

    public static void main(String[] args) {
        int[] val =MoveZerosAtEnd.move();
        System.out.println(Arrays.toString(val));
    }
}
