class Area
{
static void fun1()
{
System.out.println("Area 1");
}
static void fun2()
{
System.out.println("Area 2");
}
}
// static function er vitor non static function call kora zay na. ortat static main function er modde non static fun1, fun2 call kora zabe na. tai static fun1 , static fun2 function baniyesi...
// Static Function er vitore onno ekta class er Static function call korte hole dot(.) diye call kora hoy. (class er name.function er name). Ekhane Static class mane , er vitorer sokol function holo static function... 
// fun1 & fun2 er ketre dot class er name bola lagtese na.. karon  fun1 & fun2 oi class er moddei ase..

class ExampleOne
{
static void fun1()
{
System.out.println("A");
}
static void fun2()
{
System.out.println("B");
}
public static void main(String []args)
{
System.out.println("C");
fun1();
fun2();
Area.fun1();
Area.fun2();
}
}
