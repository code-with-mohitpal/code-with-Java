public class Main {

    static int powerOf2(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        return 2 * powerOf2(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(powerOf2(n));
    }
}
