import java.util.*;

public class WildCardDemo {

    public static void printList(List<?> list) {

        for(Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<String> l2 = Arrays.asList("A","B","C");

        printList(l1);
        printList(l2);
    }
}
