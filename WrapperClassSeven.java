// OOP kake bole: zekane shudu Object and class er kotha hobe, takee object oriented programming bole... 
// Java holo almost 100% Object Oriented Programming Language (oop language)... almost bola hocche, karon java te class & object er emon ekta concept ase, zetar karone java ke 100% oop language bola zay na, ki sei concept seta ekhon janbo... 
// class & object use kore evabe ekta variable access kora zay...
// class Box
// {
//     int x;
// }
// class WrapperClassSeven {
//    public static void main(String []args)
//    {
//         Box b1=new Box();
//         b1.x=5;
//    } 
// }

// kintu java te class & object use na koreo Predefined Data Type use kore variable declare kora zay...
// int x;
// x=5;
// tai java ke 100% oop language bola jacche na.. 

// Java ke 100% oop language bananor jonne, java amader ekta rasta bole dise. To amra ki korte pairi?? (Interview Q)
// Wrapper Class use korte pari...
/*
    Data Type -------> Class (Wrapper Class)
    int -------> Integer
    float -------> Float
    double -------> Double
    char -------> Character

    ortat predefined data type use na kore ei class gula use korar
    karone java 100% oop language hocche...

    ekhon ei Integer function er modde ki ase---

    class Integer
    {
        static int parseInt() 
        {
            onno data type ke int e rupantor/ type casting korar system
            zehetu int e firot dicche, tai return type int
        }
    }

    ekhon main e ei function k kivabe call kora hobe?
    zehetu static, tai class name dot function name

    Integer.parseInt

    zekuno data type k int e type casting korar jonne eta use kora hoy...
     
    amra ze lo
    g in er somoy username, password dei, segula string e thake. 
    taderke int e nite hole eta use hoy...  

    int x=Integer.parseInt("123")
    ekta int value return kortese, etake save kortesi int x= diye
    ekhon ei x=123 hoye zabe..      

    class Integer er moddhe aro ekta function ase
    class Integer
    {
        static int parseInt()
        {
            onno data type ke int e rupantor/ type casting korar system
            zehetu int e firot dicche, tai return type int
        }

        static Integer valueOf()
        {
            type casting kore.
            object return kore....
        }
    }

    Integer i1=Integer.valueOf("123");

    System.out.println(x); Right
    System.out.println(i1); Wrong, evabe lika zabe na...

    aro ekta non static function ase, Integer class er vitor...

    class Integer
    {
        static int parseInt()
        {
            onno data type ke int e rupantor/ type casting korar system
            zehetu int e firot dicche, tai return type int
        }

        static Integer valueOf()
        {
            type casting kore.
            object return kore....
        }
        intValue()
        {
            int data return kortese....
        }
    }
    
    ekhon ei intValue() ei function k call korte hole object banate hobe... karon eta non static
    intValue p=new intValue(); 
    kintu eta korar dorkar nei, karon valueOf theke ze i1 object return peyesi.. setakei use korte parbo...
    
    int y=i1.intValue();

    Ortat... int x=Integer.parseInt(); eka ze kaj kortese, valueOf() & intValue() duita mile sei ekoi kaj kortese...

    Integer i1=Integer.valueOf("123");
    int y=i1.intValue();

    ekhon y=123 hobe...


    baki sobgular jonneo same vabe ase

    class Double
    {
        static valueOf()
        {
        
        }
        doubleValue()
        {
        
        }
        static double parseDouble()
        {

        }
    }


    class Float
    {
        static Float valueOf()
        {
        
        }
        doubleValue()
        {
            double data type return kore
        }
        static parseFloat()
        {
            
        }
    }
*/



class WrapperClassSeven
{
    public static void main(String []args)
    {
        int x=Integer.parseInt("123");

        Integer i1=Integer.valueOf("12345");
        int y=i1.intValue();

        /*
            Binary to decimal/int e nite hole koma, diye base 2 dite hobe...
            ze number system theke decimal e nite chai, take koma diye likte hobe...  
        */
        // Binary-> Decimal
        int z=Integer.parseInt("110010",2);

        // Octal -> Decimal
        int a=Integer.parseInt("146437",8);

        // string -> Double

        Double a1=Double.valueOf("567");
        double b=a1.doubleValue();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
}