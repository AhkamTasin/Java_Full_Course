// Overriding
class A{
    void f1(){
        System.out.println("Parent function executed.");
    }

    void f2(int p){
        System.out.println("Parent function executed.");
    }
}
class B extends A{
    void f1(){
        System.out.println("Child function executed.");
    }

    void f2(int p){
        System.out.println("Child function executed.");
    }
}
public class Overrid15Part2 {
    public static void main(String []args){
        B b1=new B();
        b1.f1();
        b1.f2(45);
    }
}


