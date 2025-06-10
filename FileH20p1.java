import java.io.*;
public class FileH20p1 {
    public static void main(String []args) throws IOException{
        // Ram er modde File class er ekta obj f1 toiry koresi. zetar sate connection kore disi a.text ke. ekhon f1 diyei a.text er sokol kisu access kora zabe.
        File f1=new File("a.txt");
        // kintu ei a.text file zodi directory te age theke banano na thake,tobe she nije nije banate parbe na. 

        // directory te a.text file ta ase, ki na ta jana zay
        
        //System.out.println(f1.exists()); // a.text eta directory te ase ki na, ta check kortesi. output: false- nai, true- ase
       
        //System.out.println(f1.canWrite()); // kunokisu ki rakte parbo ei a.text e eta jiggesh kortesi. ans: false, karon a.text bole to kisui ekhono HDD te toiry hoy ni, tahole rakbo kivabe?
        
        //System.out.println(f1.length()); // a.text bole to kisu toiry hoy ni, ebong er vitor ekhono kuno kisu rakha / write kora hoy ni, tai length 0
        
        f1.createNewFile(); // directory te a.text toiry kortesi..

        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.length());
    }
}
