// Overloading
class A{
    void f1(int p){
        System.out.println("function 1 in parent executed..");
    }
    void f1(){
        System.out.println("Parent function executed.");
    }
}
class B extends A{
    void f1(int p,int q){
        System.out.println("Child function1 executed.");
    }
}
public class Overload15Part1 {
    public static void main(String []args){
        B b1=new B();
        b1.f1(3);
        b1.f1(6,7);
    }
}
