import java.util.*;

// Student class implementing Comparable
class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int attendance;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.attendance = 0;
    }

    // Sorting based on roll number
    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        TreeSet<Student> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            // Add Student
            if (parts[0].equals("A")) {

                int roll = Integer.parseInt(parts[1]);
                String name = parts[2];

                set.add(new Student(roll, name));
            }

            // Mark Attendance
            else if (parts[0].equals("M")) {

                int roll = Integer.parseInt(parts[1]);

                for (Student s : set) {

                    if (s.rollNo == roll) {
                        s.attendance++;
                        break;
                    }
                }
            }

            // Display Students
            else if (parts[0].equals("D")) {

                for (Student s : set) {
                    System.out.println(
                        s.rollNo + " " +
                        s.name + " " +
                        s.attendance
                    );
                }
            }
        }

        sc.close();
    }
}
