import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(30);

        Collections.sort(list);

        System.out.println(list);
    }
}
