/*
    Command Line Arguement...😎

*/
/*
    Java te Array bananor system alada..
    c++ --> int a[5];
    java--> int a[]=new int[5]; or 
            int []a=new int[5]; 
        ei [] age ba pore dewa zabe ...

    

*/

import javax.swing.text.html.StyleSheet;

class CommandLine8 {
    public static void main(String []args)
    {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        // zodi zototai input dei, tar sobkisu output dekate chai, tahole 
        System.out.println();
        int s=0;
        for(int i=0;i<args.length;i++)
        {
            //System.out.println(args[i]);
            s=s+Integer.parseInt(args[i]);
        }
        s=s/args.length;  
        System.out.println("Avarage is "+s);

        

    }    
}
