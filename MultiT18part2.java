// Multithread using Thread class 

class Process1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Process1: "+i);
        }
    }
}
class Process2 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Process2: "+i);
        }
    }
}

public class MultiT18part2 {
    public static void main(String []args){
        Process1 p1=new Process1();
        Process2 p2=new Process2();
        p1.start();
        p2.start();
    }
}
