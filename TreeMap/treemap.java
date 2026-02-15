import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Nepal", 5);

        System.out.println(map);
    }
}
