import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.set(1, "JavaScript");

        System.out.println(list);
    }
}
