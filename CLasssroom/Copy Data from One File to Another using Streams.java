import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("source.txt");
            FileOutputStream fout = new FileOutputStream("target.txt");

            int i;

            while((i = fin.read()) != -1) {
                fout.write(i);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully.");
        } 
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
