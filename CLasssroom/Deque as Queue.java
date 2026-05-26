import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);
    }
}
