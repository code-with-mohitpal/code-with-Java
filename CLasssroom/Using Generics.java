import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Java");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
