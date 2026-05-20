// Q9. Prime Number Check

public class Q9 {

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrime(9));
    }
}
