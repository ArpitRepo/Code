package org.example;

public class Topic {

    void firstTopic(){
        System.out.println("HashingPrinciple");
        System.out.println("Sub Queries");
    }

    void charUnder(){
        char c = 0;
        System.out.println(c);
        char d = 'A';
        System.out.println(d);
        int e = (int) d;
        System.out.println(e);

    }

    public static void main(String[] args) {
        Topic t = new Topic();
        t.charUnder();
    }
}
