// amra nije check kore hanle kore ditesi
import java.sql.SQLException;

public class ExceptionH19p5 {
    public static void main(String []args) throws SQLException{
        System.out.println("A");

        try{
            throw new SQLException("DataBase Not Found");
        }
        catch(SQLException e1){
            System.out.println(e1.getMessage());
        }
        
        System.out.println("B");
    }
}
