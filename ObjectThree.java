// access type private hole oi class er baire take access kora zabe na. 
// ekhon private static member variable k main function e call korte hole, class name dot(.) dile hobe na. karon oi main function e to takee access kora zabe na.
// ejonne Demo class er moddei ekta function banate hobe.  
class Demo{
    private static int x;
    private static int y;
    void f1()
    {
        x=5; // ekoi class e ase & static, tai sorasori access kora zacche.. static na hole object banatam. 
    }
    // zodi function ta static niye nei, tahole main function e , take call korte r object banate hobe na. 
    static void f2()
    {
        y=100;
    }
}
class ObjectThree {
    public static void main(String []args)
    {
        System.out.println("Hello Earth");
        // Demo.x; evabe hobe na. karon x private. take ei calss e access kora zabe na.
        Demo d1=new Demo();
        d1.f1();
        
        Demo.f2();
    }
}
