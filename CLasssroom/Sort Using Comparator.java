import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);

        Collections.sort(list, (a, b) -> b - a); // descending

        System.out.println(list);
    }
}
