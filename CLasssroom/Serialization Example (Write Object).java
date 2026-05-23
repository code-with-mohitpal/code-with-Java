import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeObject {
    public static void main(String[] args) {

        try {
            Student s1 = new Student(101, "Mohit");

            FileOutputStream fout = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);

            out.close();
            fout.close();

            System.out.println("Object Serialized");
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
