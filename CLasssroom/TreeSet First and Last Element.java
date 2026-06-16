import java.util.TreeSet;

class Main {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(10);
        set.add(30);

        System.out.println("First = " + set.first());
        System.out.println("Last = " + set.last());
    }
}
