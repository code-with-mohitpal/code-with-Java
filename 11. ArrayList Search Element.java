import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        if(list.contains("Python")) {
            System.out.println("Element Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
