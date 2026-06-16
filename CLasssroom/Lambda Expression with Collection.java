import java.util.ArrayList;

class LambdaCollection {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.forEach(item -> System.out.println(item));
    }
}
