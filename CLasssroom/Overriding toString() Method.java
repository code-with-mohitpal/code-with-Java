class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Mohit");
        System.out.println(s);
    }
}
