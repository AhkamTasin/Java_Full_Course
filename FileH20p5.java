                            // Read Data from File
                            
// read kora mane txt file za likha ase, setake cmd te show korte chai
import java.io.*;
public class FileH20p5 {
    public static void main(String[] args) {
        // ager code e c.txt file ta create kore felesi, tai ekhane r notun kore kora lagbe na
        try{
            FileReader r=new FileReader("E:\\Java Full Course\\Java_Full_Course\\c.txt");
            try{
                // read function ta ei FileReader er ekta function. eta charecter by charecter data read kore
                // ei read() ze charecter k read korbe setake int hishebe return korbe. And amra int i te seta save korbo

                int i;
                while((i=r.read())!=-1){ //zotokkon -1 na pacche totokkon read korbe
                    System.out.print((char)i); // txt e thaka charecter gulake int hisebe read kortese, mane ascii value return korbe. tai int k char e typecasting korbo
                }
            }
            finally{
                r.close();
            }
        }
        catch(IOException e){
            System.out.println("Exception Handled....!");
        }
    }
}
