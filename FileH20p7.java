                                    // Copy one file data to another...
                                   // c.txt----> hussen.txt te copy
                                
import java.io.*;
public class FileH20p7 {
    public static void main(String[] args) throws IOException {
        // amra chacchi c.txt file theke data gulake copy korbo notun ekta file hussen.txt te
        
        // prothome c.txt file er vitorer data guluke read korte hobe
        FileInputStream r=new FileInputStream("E:\\Java Full Course\\Java_Full_Course\\c.txt");
        
        // notun ekta file hussen.txt toiry & sekane write korar jonne FileOutputStream use korbo. Ei class automatic hussen.txt notun file create korbe.and sekane write korar permission dibe
        FileOutputStream w=new FileOutputStream("E:\\Java Full Course\\Java_Full_Course\\hussen.txt");



        // read & write kortesi
        int i;
        while((i=r.read())!=-1){
            w.write((char)i);
        }
        System.out.println("Data Copied Successfully");


    }
}
