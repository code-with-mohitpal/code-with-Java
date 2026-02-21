// Single File Programming Question
// Problem Statement



// In a coding competition, you are tasked with a unique problem. You need to write a program that calculates the sum of the squares of the odd digits in a given integer. 

// Input format :
// The input consists of a single integer N, representing the number whose odd digits will be squared and summed.

// Output format :
// The output prints an integer, representing the sum of the squares of the odd digits in the given integer.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 106

// Sample test cases :
// Input 1 :
// 12345
// Output 1 :
// 35
// Input 2 :
// 2085
// Output 2 :
// 25
// Input 3 :
// 2468
// Output 3 :
// 0
// Note :



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;

        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 != 0) {
                sum += digit * digit;
            }
            N /= 10;
        }

        System.out.println(sum);
    }
}
