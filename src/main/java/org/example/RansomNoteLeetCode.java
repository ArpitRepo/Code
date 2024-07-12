package org.example;

public class RansomNoteLeetCode {

    /*
    checks if it's possible to create a ransom note using characters from a given magazine text.
    'a' is 97, and the ASCII value of 'A' is 65
     */

    public static void main(String[] args) {

        int[] in = new int[26];
        int length = in.length;
        System.out.println(in);

//        for(int k:in){
//            System.out.println(k);
//        }


        //str1=ransom note
        String str1 = "aa";
        char[] str2 = str1.toLowerCase().toCharArray();
        String msg = "aab";
        char[] msg1 = msg.toCharArray();

        for(char jj :msg1){
          in[jj-'a']++;

        }

        for(char kl :str2){
            in[kl-'a']--;

        }

        int i =0;
        System.out.println(in);

      for(int iii : in){
         i++;

          }

      if(i>0){
          System.out.println("Code Passed");
      }


//        for (int i=0;i<msg1.length;i++){
//
//            int i1 = in[msg1[i-'a']];
//            System.out.println(i1);
//
//        }
    }
}


//
//    public static boolean canConstruct(String ransomNote, String magazine) {
//        int[] arr = new int[26];
//
//        for (int i = 0; i < magazine.length(); i++)
//            arr[magazine.charAt(i) - 'a']++;
//
//        for (int i = 0; i < ransomNote.length(); i++) {
//            int offs = ransomNote.charAt(i) - 'a';
//
//            if (arr[offs] > 0)
//                arr[offs]--;
//            else
//                return false;
//        }
//
//        return true;
//    }