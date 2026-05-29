import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);

        for(Integer n : dq) {
            System.out.println(n);
        }
    }
}
