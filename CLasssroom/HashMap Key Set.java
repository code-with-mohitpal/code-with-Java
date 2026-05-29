import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Mohit");
        map.put(102, "Rahul");

        System.out.println(map.keySet());
    }
}
