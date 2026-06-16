import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> student = new HashMap<>();

        student.put(101, "Mohit");
        student.put(102, "Rahul");

        System.out.println(student);

        student.remove(101);

        System.out.println(student);
    }
}
