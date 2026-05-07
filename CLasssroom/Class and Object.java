class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Mohit pal";

        s1.display();
    }
}
