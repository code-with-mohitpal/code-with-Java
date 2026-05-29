import java.util.TreeSet;

class Main {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        set.remove(20);

        System.out.println(set);
    }
}
