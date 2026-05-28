import java.util.*;

class DescComparator implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

class Main {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>(new DescComparator());

        set.add(10);
        set.add(50);
        set.add(20);

        System.out.println(set);
    }
}
