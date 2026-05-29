import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();

        dq.addFirst("A");
        dq.addLast("B");
        dq.addLast("C");

        System.out.println(dq);

        dq.removeFirst();

        System.out.println(dq);
    }
}
