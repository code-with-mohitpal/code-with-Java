import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1234);
        list.add("list");
        list.add(true);
        list.add(12.57);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
