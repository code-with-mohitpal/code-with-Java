class Student {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        
    }

    // Method to calculate grade using if-else
    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student(101, "Rahul", 85);
        Student s2 = new Student(102, "Anita", 92);
        Student s3 = new Student(103, "Aman", 38);

        // Displaying results
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
