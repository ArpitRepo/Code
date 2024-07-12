package Practice;

public class OverridingConcepts {

    int a =5;
    String b="Some";

    int c;
    String d;
    public OverridingConcepts(int c, String d){
        this.c =c;
        this.d= d;
    }
    void m(){
        System.out.println("hi");
    }

    @Override
    public String toString(){
        return c  + " " +d;
    }
}

class B extends OverridingConcepts{

    public B(int c, String d) {
        super(c, d); // Call the parameterized constructor of superclass
    }
    void m(){


        System.out.println(super.a);
        System.out.println(super.b);
        super.m();

        System.out.println("hello");
    }
}

class C {
    public static void main(String[] args) {
        OverridingConcepts o = new OverridingConcepts(65, "Arpit");
        System.out.println(o.toString());
        o.m();
B obj = new B(3,"Arp");
        System.out.println(obj.toString());
obj.m();
    }


}
