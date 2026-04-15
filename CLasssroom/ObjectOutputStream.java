import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        Employee emp1 = new Employee(21, "raj");

        try {
            FileOutputStream fos = new FileOutputStream("employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp1);

            oos.close();
            fos.close();

            System.out.println("Object serialized successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
