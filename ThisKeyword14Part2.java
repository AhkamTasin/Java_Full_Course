class Example{
    int x,y;
    void f1(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
class Example1 extends Example{
    int x,y;
    void f2(int x,int y){
        super.x=x;
        super.y=y;
        // super thakay parent er x, y e save hobe...
    }
    void f3(int x){
        this.x=x;
        // this thakay ei child Example1 er x e save hobe,,,
    }
    void f4(){
        int x=200;
        System.out.println(x); // shudu x mane ei function e banano x
        System.out.println(this.x); // this deway ei child er x
        System.out.println(this.y); // eta 0 karon kisui save hoy ni
        System.out.println(super.x); // super deway parent er x
        System.out.println(super.y); 

    }
}
public class ThisKeyword14Part2 {
    public static void main(String []args){
        Example1 e1=new Example1();
        e1.f2(5,6);
        e1.f3(100);
        e1.f4();
    }
}
