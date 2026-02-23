// Single File Programming Question
// Problem Statement



// Hari is working on a Java program for his homework to calculate the sum of two and three integers. Write a program that allows Hari to input two integers and three integers separately. Use overloaded methods called sum to calculate and display the sum for each case.

// Input format :
// The first line of input consists of two space-separated integers m and n.

// The second line consists of three space-separated integers a, b, and c.

// Output format :
// The first line of output prints "Sum of two integers: " followed by an integer representing the sum of m and n.

// The second line prints "Sum of three integers: " followed by an integer representing the sum of a, b, and c.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ input integers ≤ 1000

// Sample test cases :
// Input 1 :
// 12 34 
// 56 78 63
// Output 1 :
// Sum of two integers: 46
// Sum of three integers: 197
// Input 2 :
// 523 178 
// 481 989 124
// Output 2 :
// Sum of two integers: 701
// Sum of three integers: 1594
// Note :





import java.util.Scanner;

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Calculator obj = new Calculator();

        System.out.println("Sum of two integers: " + obj.sum(m, n));
        System.out.println("Sum of three integers: " + obj.sum(a, b, c));

        sc.close();
    }
}
