import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        for(Integer n : list) {
            list.remove(n);
        }
    }
}
