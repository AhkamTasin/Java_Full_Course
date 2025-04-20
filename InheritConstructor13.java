/*zodi class gulute constructor thake, tobe obj toiri korle constructor call hobe.
Ekhon zodi child class Nokia2 er obj toiry kori, tobe kun constructor ta age cholbe? Nokia1, naki Nokia2?
Rules holo: child class call korle execution er somoy protome parent constructor and then child constructor executed hobe.. 
Ei jinish ta hower jonne -->
child er object toiri howay, child constructor call hobe ebong sekane Zabe, ebong sekane automatic super() namok ekta function toiry hobe (zodi ami nize super function like dei, tobe compiler auto likbe na).. 
erpor super function call hobe ebong parent constructor e chole asbe... erpor parent constructor executed hobe, erpor child constructor executed hobe...

Call:--> child to parent [using super()]
Execution:--> parent to child
*/
class Nokia1{
    int x,y;
    void fun1(){
        System.out.println("Parent function 1 executed.");
    }
    void fun2(){
        System.out.println("Parent function 2 executed.");
    }
    Nokia1(){
        System.out.println("Parent Constructor executed.");
    }
}
class Nokia2 extends Nokia1{
    // Nokia1 er sob member ekhane chole asche, kintu deka zacche na...
    int z;
    void fun3(){
        System.out.println("Child function 1 executed.");
    }
    Nokia2(){
        super();
        System.out.println("Child Constructor executed.");
    }
}
public class InheritConstructor13 {
    public static void main(String []args){
        Nokia2 n2=new Nokia2(); 
    }
}
