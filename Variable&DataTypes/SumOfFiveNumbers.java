import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum of 5 numbers = " + sum);
    }
}

