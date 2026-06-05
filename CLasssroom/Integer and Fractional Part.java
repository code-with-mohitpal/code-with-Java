import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();

        int integerPart = (int) num;
        double fractionalPart = num - integerPart;

        System.out.println("Integer Part = " + integerPart);
        System.out.println("Fractional Part = " + fractionalPart);
    }
}
