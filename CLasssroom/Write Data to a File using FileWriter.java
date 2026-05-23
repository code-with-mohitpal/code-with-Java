import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");

            fw.write("Hello Java File Handling");
            fw.write("\nWelcome to I/O Streams");

            fw.close();

            System.out.println("Data written successfully.");
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
