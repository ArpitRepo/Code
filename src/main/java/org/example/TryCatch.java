package org.example;

public class TryCatch {
    public void  negScenario(){
        try{
            if(5==5){
                System.out.println("Correct");
            }
        }
        finally
        {
            System.out.println("execute anyway");
        }
    }

    public static void main(String[] args) {
        TryCatch t = new TryCatch();
        t.negScenario();
    }
}
