// Single File Programming Question
// Problem Statement



// Liam wants to determine if the number of pages in a book he plans to read is odd. He wants to write a program where the user inputs a single integer representing the number of pages. The program should check if the number is odd and display the result in the specified format.



// Can you guide Liam in this?

// Input format :
// The input contains a single integer n, representing the number of pages in the book.

// Output format :
// The output prints "Is the integer odd? " followed by a boolean value, representing whether n is even or odd.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 105

// Sample test cases :
// Input 1 :
// 47
// Output 1 :
// Is the integer odd? true
// Input 2 :
// 486
// Output 2 :
// Is the integer odd? false


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is the integer odd? " + (n % 2 != 0));
    }
}
