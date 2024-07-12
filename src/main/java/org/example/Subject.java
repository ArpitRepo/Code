package org.example;

public class Subject {

    static Topic obj = new Topic();

    public void meth(){
        obj.firstTopic();
    }

    public static void main(String[] args) {
        obj.firstTopic();
        //obj.secondTopic();
    }
}
