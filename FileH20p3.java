                                    // File information
import java.io.*;
public class FileH20p3 {
    public static void main(String[] args) {
        File f=new File("E:\\Java Full Course\\Java_Full_Course\\b.txt");

        if(f.exists()){
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());  
            System.out.println("File Writable?: "+f.canWrite());
            System.out.println("File Readable?: "+f.canRead());
            System.out.println("File Size: "+f.length());
            // Information gula dekhanor por chai file ta delete kore dite...
            System.out.println("File Deleted/Removed: "+f.delete()); // boolean e ans show korbe .. file delete kortese tai true 
            // zehetu file delete hoye gese, tai er porer bar run korle File doesn't exist dekabe.
        }
        else{
            System.out.println("File doesn't exist....");
        }
    }
}
