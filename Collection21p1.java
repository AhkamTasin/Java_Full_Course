                            // Array List

import java.util.*;
public class Collection21p1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();    

        a.add("Tasin");
        a.add("Kamal");
        a.add("Ahkam");

        System.out.println(a);

        a.add("Tomal");
        System.out.println(a);

        // zoto add korbo list er dharonkhomota toto barbe
        // .add() dile last e append hobe
        
        // zodi amra icchamoto index e add korte chai, thahole  
        // indexing 0 theke shuru
        a.add(1,"Rohit");
        System.out.println(a);


        // amra zodi kuno index er value delete korte chai...
        a.remove(3); // Ahkam remove kortesi

        System.out.println(a);


        // amra zodi kuno index er value k onno ekta value diye replace korte chai... tahole
        a.set(0,"Hamza");
        System.out.println(a);


        // zodi shudu ekta index er value print korte chai.. 
        System.out.println(a.get(2));

        // array tar sokol value zodi ekshate delete korte chai
        a.clear();
        System.out.println(a);
    }
}
