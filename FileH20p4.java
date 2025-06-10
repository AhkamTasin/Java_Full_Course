                                    // Write on File
import java.io.*;
public class FileH20p4 {
    public static void main(String[] args) throws IOException {
        File f1=new File("E:\\Java Full Course\\Java_Full_Course\\c.txt");
        if(f1.createNewFile()){
            System.out.println("New File created successfully");
        }else{
            System.out.println("File Already exist..");
        }

        // write korte chai
        // zehetu c.txt ei file tate ekhon write korte chai FileWriter class use kore, tai oi class er ekta obj f banacchi, ebong f er shate c.txt er connection kore dicchi zate f diye access kora zay, write function gula likhar somoy....
        FileWriter f=new FileWriter("E:\\Java Full Course\\Java_Full_Course\\c.txt"); // ei line likhar somoy IOException ashte pare. throws diye handle koresi tai r try catch dewa lagbe na.. throws na dile etake try catch diye handle korte hoto
        // niche try catch ditesi, karon write e kuno error ashleo zeno file ta close hoye zay. close function sobsomoy finally er vitor likha valo....
        try{
            f.write("Hello Tasin, This is your first writing in file....");
        }
        finally{
            f.close();
        }
        System.out.println("Successfully data wrote in class...");
    }
    
}
