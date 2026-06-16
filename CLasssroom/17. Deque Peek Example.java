import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);

        System.out.println("Front Element: " + dq.peekFirst());
        System.out.println("Last Element: " + dq.peekLast());
    }
}
