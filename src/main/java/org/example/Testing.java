package org.example;

import java.util.HashMap;
import java.util.Map;

/*

[17:03] Goyal, Bhuvnesh
Given two strings, string 1 and string 2, select only the characters in each string where the character in the
same position in the other string is in uppercase.
 Return these as a single string.

e.g., if string 1 = “heLLo” and string 2 = “GUlp”, Output would be “help”
 0 0 he23 lp
Solution Reasoning – we select letters “he” from string 1 since G and U from string 2 are uppercase, similarly we select letters “lp” from string 2 since LL
 from string 1 are in uppercase. Finally, when we join “he” and “lp” we got “help”.

  0 1 2 3 r l



 if 1) case then alternate

Other Examples: -

I/P – “1234567”, “XxXxX”, O/P – “135”

I/P – “EVERYTHING”, “SomeThings”, O/P – “EYSomeThings”
 */
public class Testing {



    static void meth(){
        String one  = "heLLo";

        char varqw= one.charAt(0);
        int daff = (int) varqw;
        String two = "GUlp";
        Map<Integer,Character> hp = new HashMap<>();
        int lenOne = one.length();
        int lenTwo = two.length();
        int max= 0;
        String res;

        if(lenOne>lenTwo){
            max= lenTwo;
        }else max= lenOne;



        for(int i=0;i<max;i++){

            int valOne = (int) one.charAt(i);
            int valTwo = (int) two.charAt(i);


            if(valOne>65 && valOne<91 && valTwo < 97 && valTwo >123){
                hp.put(i,one.charAt(i));
            }

           else if (valOne >97 && valOne <127 && valTwo > 65 && valTwo<92)
           {
            hp.put(i,two.charAt(i));
            }


        }
        System.out.println(hp);

    }
    public static void main(String[] args) {
        meth();
    }
}
