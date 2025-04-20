/*
zodi parameter pass kore.. tobe 
super() theke zegula pass korbo, segula recive korbe parent class...
*/ 
class Nokia1{ // parent
    int x,y;
    void fun1(){
        System.out.println("Parent function 1 executed.");
    }
    void fun2(){
        System.out.println("Parent function 2 executed.");
    }
    Nokia1(int p,int q){
        x=p;y=q;
        System.out.println("Parent Constructor executed.");
    }
}
class Nokia2 extends Nokia1{ // child
    // Nokia1 er sob member ekhane chole asche, kintu deka zacche na...
    int z;
    void fun3(){
        System.out.println("Child function 1 executed.");
    }
    Nokia2(int a){
        super(5,7); // eita parent ke call korbe automatic and ei parameter gula receive korbe parent
        z=a;
        System.out.println("Child Constructor executed.");
    }
}
public class InheritConstructor13part2 {
    public static void main(String []args){
        Nokia2 n2=new Nokia2(100); // zehetu child er obj,  tai ei parameter receive korbe child er constructor
        System.out.println(n2.x);
        System.out.println(n2.y);
        System.out.println(n2.z);
    }
}
