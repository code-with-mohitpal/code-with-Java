import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class NameComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class TreeSetComparator {
    public static void main(String[] args) {

        TreeSet<Employee> ts =
            new TreeSet<>(new NameComparator());

        ts.add(new Employee(101, "Rahul"));
        ts.add(new Employee(102, "Aman"));
        ts.add(new Employee(103, "Priya"));

        for(Employee e : ts) {
            System.out.println(e);
        }
    }
}
