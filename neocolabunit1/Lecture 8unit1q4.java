// Single File Programming Question
// Problem Statement



// Brian is developing a program that requires analyzing numbers. He needs to determine whether a given number is positive, negative or zero. 



// Brian is seeking your assistance in creating a program to help him with this task.

// Input format :
// The input consists of a single integer representing the number to be analyzed.

// Output format :
// The output prints:

// "Positive" if the given integer is greater than 0.
// "Negative" if the given integer is less than 0.
// "Zero" if the given integer is equal to 0.


// Refer to the sample output for the exact text.

// Code constraints :
// The given test cases fall under the following constraints:

// -106 ≤ input integer ≤ 106

// Sample test cases :
// Input 1 :
// 70
// Output 1 :
// Positive
// Input 2 :
// -56
// Output 2 :
// Negative
// Input 3 :
// 0
// Output 3 :
// Zero



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
