package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain{

    int value = 10;
    int rollNo;
    String name;

    public TestMain(int rollNo, String name){
        this.rollNo= rollNo;
        this.name=name;

    }
public void m(){
    System.out.println("hi");
}

@Override
public String toString(){
        return rollNo + " " + name;
}

}

 class Bob extends TestMain{

    public Bob(int roll, String name){
      super(98, "fdgg");
    }


     public void m(){

         System.out.println("hello");
         super.m();
         System.out.println(super.value);


     }

}

class Main{
    public static void main(String[] args) throws OwnExcep {

Bob b = new Bob(5, "Arpit");
        System.out.println(b);
b.m();



}



    }

