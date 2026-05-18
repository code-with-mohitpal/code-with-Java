class OperatorsExample {
    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        System.out.println("Logical AND: " + (a > b && b > 0));
        System.out.println("Relational: " + (a == b));

        int result = (a > b) ? a : b;

        System.out.println("Ternary Result: " + result);
    }
}
