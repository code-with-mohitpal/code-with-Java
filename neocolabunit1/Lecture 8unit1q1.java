// Single File Programming Question
// Problem Statement



// Emma, a mathematics teacher, wants to demonstrate to her students how to find the largest and smallest numbers among a set of values. She has five numbers from her textbook, and she wants to illustrate the process using a program.



// Your task is to write a program for Emma to demonstrate.

// Input format :
// The input consists of five space-separated integers, representing the five numbers.

// Output format :
// The first line of output prints "Largest: " followed by an integer representing the largest number among the inputs.

// The second line of output prints "Smallest: " followed by an integer representing the smallest number among the inputs.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given testcases fall under the following constraints:

// -10000 ≤ input integers ≤ 10000

// Sample test cases :
// Input 1 :
// 3 7 10 2 8
// Output 1 :
// Largest: 10
// Smallest: 2
// Input 2 :
// -5 -12 9 3 -8
// Output 2 :
// Largest: 9
// Smallest: -12



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest, smallest;

        // Read first number
        int num = sc.nextInt();
        largest = num;
        smallest = num;

        // Read remaining four numbers
        for (int i = 0; i < 4; i++) {
            num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
        }

        // Output
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

        sc.close();
    }
}  
