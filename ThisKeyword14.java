class Example{
    private int x,y;
    void f1(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class ThisKeyword14 {
    public static void main(String []args){
        Example e1=new Example();
        e1.f1(2,3);
        e1.display();
    }
}
