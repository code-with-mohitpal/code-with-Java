import java.util.TreeSet;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

class Main {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student(3, "Mohit"));
        set.add(new Student(1, "Rahul"));
        set.add(new Student(2, "Aman"));

        System.out.println(set);
    }
}
