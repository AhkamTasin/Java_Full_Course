// Abstruct..
abstract class Demo{
    int x,y;
    void fun1(){
        x=5;
    }
    abstract void fun2();
    // Constructor
    Demo(){
        System.out.println("Parent class executed.");
    }
}    
class Demo1 extends Demo{
    int z;
    void fun3(){
        z=1;
    }
    // Override korte hobe
    void fun2(){

    }
    // Constructor
    Demo1(){ 
        super(); // ami na likle se auto like dibe
        System.out.println("Child class executed.");
    }
}
public class Abs16 {
    public static void main(String []args){
        Demo1 d1=new Demo1();
        d1.fun1();
    }
}
