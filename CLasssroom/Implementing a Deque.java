import java.util.*;

public class DequeExample {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

        dq.addFirst("A");
        dq.addLast("B");
        dq.addFirst("C");

        System.out.println(dq);

        dq.removeLast();

        System.out.println(dq);
    }
}
