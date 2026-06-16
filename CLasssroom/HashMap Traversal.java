import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");

        for(Map.Entry<Integer, String> e : map.entrySet()) {

            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
