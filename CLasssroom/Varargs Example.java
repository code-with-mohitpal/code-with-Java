public class VarArgsExample {

    static void display(int... numbers) {
        for(int n : numbers) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        display(1, 2, 3, 4, 5);
    }
}
