import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        map.replace(2, "C++");

        System.out.println(map);
    }
}
