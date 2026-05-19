class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(1);

        System.out.println(e1.equals(e2));
    }
}
