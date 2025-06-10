                                // Rename a File
import java.io.*;
public class FileH20p6 {
    public static void main(String []args) throws IOException{

        // step 1: protome shudu ei step 1 run korbo
        // File f1=new File("E:\\Java Full Course\\Java_Full_Course\\tasin.txt");
        // if(f1.createNewFile()){
        //     System.out.println("File created Successfully....!");
        // }
        // else{
        //     System.out.println("File already Exist.....!");
        // }

        
        // zodi age thekei tasin.txt toiry thake , taile shudo 
        File f1=new File("E:\\Java Full Course\\Java_Full_Course\\tasin.txt"); //ei line like step 2 te chole zabo

        // erpor ei step 2 run korbo
        // ekhon ami ei tasin.txt file k rename korte chai...
        File x=new File("E:\\Java Full Course\\Java_Full_Course\\ahkam.txt");
        // x k ei notun name ahkam.txt er shate connected kore disi

        if(f1.exists()){
            System.out.println(f1.renameTo(x)); // true print hobe mane rename successful
        }
        else{
            System.out.println("File doesn't exist...");
        }
    }

}
