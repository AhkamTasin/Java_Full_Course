                            // LinkedList (Doubly Linked List)
import java.util.*;
public class Collection21p2 {
    public static void main(String[] args) {
        LinkedList<String> a=new LinkedList<String>();
        a.add("ahkam");
        a.add("tasin");
        a.add("Tarik");
        System.out.println(a);
        // list er surute add korte chaile
        a.addFirst("Zamal");
        System.out.println(a);
 
        // normally add() korle seta list er last e add hoy
        // tobe adorsho holo end position e add korte chaile
        a.addLast("Hamza");
        System.out.println(a);

        // onno zekuno index e insert korte chile
        a.add(2,"Samit Some");
        System.out.println(a);



        // delete/ Remove a value
        
        // zodi shudo remove() dei tobe beginning theke delete hote thakbe
        a.remove();
        System.out.println(a);
        a.remove();
        System.out.println(a);

        // First value remove:
        a.removeFirst();
        System.out.println(a);

        // last value remove:
        a.removeLast();
        System.out.println(a);


        // Kuno index er value delete kote chaile
        a.remove(1);
        System.out.println(a);
    }
}
