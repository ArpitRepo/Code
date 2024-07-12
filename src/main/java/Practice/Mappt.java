package Practice;

import java.util.HashMap;
import java.util.Map;

public class Mappt {

    static void meth(){
        int var =5;
        Map<Integer, String> mo = new HashMap();
        mo.put(1,"terg");
        mo.put(13,"ret");
        mo.put(133,"yh");
        for(Map.Entry<Integer, String> nm : mo.entrySet()){
            System.out.print(nm.getKey());
        }
    }


    static void b(){
        String a = "HelloAll";

       // if(a.isUpperCase()){
//The String class in Java does not have a method isUpperCase(). Instead, you need to check each character of the string to determine if it is uppercase using
// the Character.isUpperCase()
        //}
        String b= a.toLowerCase();
        char v = Character.toLowerCase(a.charAt(0));
        int yt = (int) v;

        System.out.println(v +" " +yt );

        String s[] = a.split("");

        String res = "";

        for(int j =0;j<a.length(); j++){
            if(Character.isUpperCase(s[j].charAt(0))){
                res = res + s[j];

            }
        }

        for(int i=0; i<a.length(); i++){

            if(Character.isUpperCase(a.charAt(i))){
                System.out.println("Hey");
            }
        }

        System.out.println(res);
    }
    public static void main(String[] args) {


        b();
    }
}
