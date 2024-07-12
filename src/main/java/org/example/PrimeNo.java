package org.example;

public class PrimeNo {

   static boolean isPrime(int no){
       int j =0;
       if(no<=2){
           return true;
       }
       for(int i =2;i<no;i++){
           if(no%i==0){
               return false;
           }
       }


       return true;
   }

    public static void main(String[] args) {
        boolean bbol = PrimeNo.isPrime(4);
        System.out.println(bbol);
    }
}
