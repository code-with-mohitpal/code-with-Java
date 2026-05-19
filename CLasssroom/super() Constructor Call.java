class Person {
    Person() {
        System.out.println("Person Constructor");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
