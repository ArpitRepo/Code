package org.example;

 class ClassImplementing implements InterfaceOne, InterfaceTwo{

    public void methor(){

        InterfaceOne.super.meth();
        InterfaceTwo.super.meth();
    }

    public void abc(){
        System.out.println("Hello");
    }

     @Override
     public void meth() {
         System.out.println("hi");
     }

     public static void main(String[] args) {
        ClassImplementing obj = new ClassImplementing();
        obj.methor();
        obj.abc();
        obj.meth();
    }
}
