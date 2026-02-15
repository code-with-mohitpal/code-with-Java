import java.util.LinkedHashMap;
import java.util.Map;

public class linkedmap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map =
                new LinkedHashMap<>(16, 0.75f, true);

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.get("A");  // Access A

        System.out.println(map);
    }
}