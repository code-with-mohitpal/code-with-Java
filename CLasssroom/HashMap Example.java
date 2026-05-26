import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Mohit");
        map.put(2, "Rahul");
        map.put(3, "Aman");

        System.out.println(map);

        System.out.println(map.get(2));
    }
}
