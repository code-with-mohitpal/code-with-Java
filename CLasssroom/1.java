// Q1. Salary Final Tax Rate

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        double tax;

        if (salary < 30000) {
            tax = salary * 0.05;
        } else if (salary <= 70000) {
            tax = salary * 0.15;
        } else {
            tax = salary * 0.25;
        }

        System.out.println("Tax = " + tax);
    }
}