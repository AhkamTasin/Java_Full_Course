// Zodi instance member variable private hoy, tahole main e call korar jonne object toiry korte hobe. kintu object diye sorasori x ke access kora zabe na. karon x private. tai public/default function banate hobe... erpor oi object diye function k access korbo..

// Sobar protome static gula memory te toiry hobe..
class A
{
    private int x; // Instance member variable
    private static int y;
    void fun1()
    {
        y=22;
        x=5;    
    }
    void fun2()
    {
        System.out.println(x);
    }
    void fun3()
    {
        y=45;
    }
}
class StaticMemberFive {
    public static void main(String []args)
    {
        A a1=new A();
        A a2=new A();
        a1.fun1();
        a2.fun2();    
    }
}
