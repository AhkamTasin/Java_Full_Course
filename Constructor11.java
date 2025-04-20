class Demo{
    int x,y;
    Demo(int p,int q) // duita dile eta kaj korbe
    {
        x=p;
        y=q;
    }
    Demo(int f) // zodi ekta perameter dei tobe eta kaj korbe
    {
        x=f;
    }
    Demo() // kiccu na dile eta kaj korbe
    { 
        System.out.println("d3 is created");
    }
}
public class Constructor11 {
    public static void main(String []args)
    {
        Demo d1=new Demo(5,3);
        Demo d2=new Demo(5);
        Demo d3=new Demo();
        System.out.println(d1.x);
        System.out.println(d2.x);
    }
}
