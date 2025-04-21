// Interface...
interface i1{
    int x=6;
    void f1();
    // new version 8+ er jonne ei feature
    static void f2(){
        System.out.println(x);
    }
}
interface i2 extends i1{
    int x=9; // interface er child er ketre/ interface extend er ketre variable er overriding hote pare... kintu function overriding hobe na.. karon interface e function abstruct hoy.. 
    int y=2;
    void f3();
}
class c1 implements i2{
    // ekhane function overriding hobe, karon eta normal class...
    public void f1(){

    }
    public void f3(){

    }
}
public class InterF17 {
    public static void main(String []args){
        i1.f2(); // zehetu static tai tar class dot diye access kortesi
        c1 p1=new c1();
        System.out.println(p1.x);
        System.out.println(p1.y);
        // p1 diye f2() k access kora zabe na.. karon seta static.. obj sudu instance member k refer kore


        
    }
}
