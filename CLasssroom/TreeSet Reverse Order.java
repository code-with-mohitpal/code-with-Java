import java.util.Collections;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {

        TreeSet<Integer> set =
                new TreeSet<>(Collections.reverseOrder());

        set.add(10);
        set.add(40);
        set.add(20);

        System.out.println(set);
    }
}
