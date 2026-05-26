import java.util.*;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }
}

class AgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

class Main {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>(new AgeComparator());

        set.add(new Student(22, "Mohit"));
        set.add(new Student(19, "Rahul"));
        set.add(new Student(21, "Aman"));

        System.out.println(set);
    }
}
