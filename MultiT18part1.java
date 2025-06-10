// Multithreading using Runnable interface


/* step 1: 
class Process1{
    void f1(){
        for(int i=1;i<=10;i++){
            System.out.println("Process1: "+i);
        }
    }
}
class Process2{
    void f2(){
        for(int i=1;i<=10;i++){
            System.out.println("Process2: "+i);
        }
    }
}
public class MultiT18part1 {
    public static void main(String []args){
        // ekhon class duitar obj banabo, fole duita process toiry hobe
        Process1 p1=new Process1();
        Process2 p2=new Process2();
    }
} 
*/

// step 2

class Process1 implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Process1: "+i);
        }
    }
}
class Process2 implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Process2: "+i);
        }
    }
}
public class MultiT18part1 {
    public static void main(String []args){
        // ekhon class duitar obj banabo, fole duita process toiry hobe
        Process1 p1=new Process1();
        Process2 p2=new Process2();
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        // Thread calate hobe/ gari chalate hobe
        t1.start();
        t2.start();
    }
}

// ekhane output e duita for loop ekshate choltese, emonta noy ze ekta sesh howar por arekta choltese.. borong duitai ekshate choltese....
