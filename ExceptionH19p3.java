// Amra exception throw kortesi
public class ExceptionH19p3 {
    public static void main(String []args){
        int cb=1000;
        int wb=10000;
        try{
            if(cb<wb){
                throw new ArithmeticException("Insufficient Balance");
            }
            cb=cb-wb;
            System.out.println("Transaction successfull");
            System.out.println("Current Balance: "+cb);
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
            System.out.println("Current Balance: "+cb);
        }
    }
}
