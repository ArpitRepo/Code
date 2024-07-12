package org.example;

//Class as return type
public class ClassAsRT {

    String name; String car;

    ClassAsRT(String name, String car){
        this.name=name;
        this.car=car;
    }

static ClassAsRT meth(String name, String car){
        return new ClassAsRT(name, car);
}

    public static void main(String[] args) {
        ClassAsRT var = ClassAsRT.meth("Arpit", "Audi");
        System.out.println(var);
    }

    @Override
     public String toString() {
        return name+ " " +car;
    }
}
