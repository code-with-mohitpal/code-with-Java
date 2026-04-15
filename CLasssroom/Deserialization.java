import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectDeserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee emp1 = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Employee ID: " + emp1.empId);
            System.out.println("Employee Name: " + emp1.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
