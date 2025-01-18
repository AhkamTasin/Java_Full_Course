// Java special rule: class kokhonoi Private Or Protected hote parbe na...
// ekta java file er vitore shudu matro ektai class public hote parbe.. and sei class holo: ze class er modde main ase, shudu sei class e public hote parbe... 
// public korte hobe eta mandatory noy, tobe zodi kori, tobe main er class tai public kora zabe..
// Class er vitore o aro class toiry kora zabe, tader bola hoy Inner class. R sei Inner class gula Private or Protected hote pare... 

class Nokia
{
    private int mic;
    private int cam;
    void setValue()
    {
        mic=2;
        cam=40;
    }
    void display()
    {
        System.out.println(mic);
        System.out.println(cam);
    }
}
class ClassesAndObjectSix {
    public static void main(String []args)
    {
        Nokia n1=new Nokia();
        n1.display(); // protome kuno value set hoy nai, tai default vabe mic and cam e thaka 0 value print hobe..
        n1.setValue();
        n1.display();
    }
}
