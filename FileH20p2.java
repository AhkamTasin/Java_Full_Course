                        // Create a File
import java.io.*;
public class FileH20p2 {
    public static void main(String []args) throws IOException{
        File f1=new File("E:\\Java Full Course\\Java_Full_Course\\b.txt");
        if(f1.createNewFile()){
            System.out.println("File created Successfully....!");
        }
        else{
            System.out.println("File already Exist.....!");
        }
    }

}



/* Amra try catch diyeo IOException ta handle korte pari


import java.io.*;
public class FileH20p2 {
    public static void main(String []args){
        File f1=new File("E:\\Java Full Course\\Java_Full_Course\\b.txt");
        
        try{
            if(f1.createNewFile()){
                System.out.println("File created Successfully....!");
            }
            else{
                System.out.println("File already Exist.....!");
            }
        }
        catch(IOException i){
            System.out.println("IOExeption Handled....");
        }    


    }

}
 



*/