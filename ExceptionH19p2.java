
public class ExceptionH19p2 {
    public static void main(String []args){
        
        try{
            System.out.println(5/0);
        }
        catch(Exception e1){
            System.out.println(e1.getMessage());
        }
        
        finally{
            System.out.println("A");
        }
    }
}
