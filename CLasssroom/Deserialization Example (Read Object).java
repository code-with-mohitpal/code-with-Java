import java.io.*;

class Student implements Serializable {
    int id;
    String name;
}

public class DeserializeObject {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);

            Student s = (Student) in.readObject();

            in.close();
            fin.close();

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
