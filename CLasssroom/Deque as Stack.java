import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
    }
}
