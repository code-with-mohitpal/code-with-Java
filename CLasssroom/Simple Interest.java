import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        float P = sc.nextFloat();

        System.out.print("Enter Rate: ");
        float R = sc.nextFloat();

        System.out.print("Enter Time: ");
        float T = sc.nextFloat();

        float SI = (P * R * T) / 100;

        System.out.println("Simple Interest = " + SI);
    }
}
