import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, evenSum = 0, oddSum = 0;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Sum of Even numbers = " + evenSum);
        System.out.println("Sum of Odd numbers = " + oddSum);
    }
}

