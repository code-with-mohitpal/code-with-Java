import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> map =
                new TreeMap<>(Collections.reverseOrder());

        map.put(10, "A");
        map.put(20, "B");
        map.put(5, "C");

        System.out.println(map);
    }
}
