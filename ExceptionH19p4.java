// throws 
// java k age theke bole dicchi ei exception aste pare, zegula hanle korte hobe, na hole compiletime error hobe

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionH19p4 {
    public static void main(String []args) throws IOException,SQLException,ClassNotFoundException{
        System.out.println("A");
        // ami koma, diye diye Exception gula like dibo , eder modde kuno execption vobissote ashle setake handle kore dibe, 
        // mane compiletime error dekabe na.. compile hoye zabe
        throw new IOException();
        // zehetu java handle kortese tai ekhane program terminate hoye zabe
    }
}
