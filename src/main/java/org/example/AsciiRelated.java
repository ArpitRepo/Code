package org.example;

public class AsciiRelated {

static void metho(){
    char a = 'A';
    int in = a;
    System.out.println(in);
}


    public static void main(String[] args) {

        AsciiRelated.metho();

        char c = '*';
        char d = 'a';
        char e = 'A';



        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }




}
