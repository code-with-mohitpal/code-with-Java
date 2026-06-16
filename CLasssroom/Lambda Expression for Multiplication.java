interface Multiply {
    int product(int a, int b);
}

class Test {
    public static void main(String[] args) {

        Multiply m = (a, b) -> a * b;

        System.out.println("Multiplication = " + m.product(5, 4));
    }
}
