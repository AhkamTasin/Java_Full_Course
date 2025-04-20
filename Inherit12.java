// Inheritence
class Nokia1{
    int x,y;
    void fun1(){
        System.out.println("Parent function 1 executed.");
    }
    void fun2(){
        System.out.println("Parent function 2 executed.");
    }
}
class Nokia2 extends Nokia1{
    // Nokia1 er sob member ekhane chole asche, kintu deka zacche na...
    int z;
    void fun3(){
        System.out.println("Child function 1 executed.");
    }

}
public class Inherit12 {
    public static void main(String []args){
        System.out.println("For Nokia1 obj");
        Nokia1 n1=new Nokia1();
        n1.fun1();
        n1.fun2();
        //n1.fun3(); eta call kora zabe na.. karon se parent.. tai se child ke access korte parbe na.
        // shudo matro child tar parents ke access korte parbe...
        System.out.println("For Nokia2 obj");
        Nokia2 n2=new Nokia2();
        n2.fun1();
        n2.fun2();
        n2.fun3();
    }
}
