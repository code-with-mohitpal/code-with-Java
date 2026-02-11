// Single File Programming Question
// Problem Statement



// Arjun wants to calculate the square and cube of a number for his math project. Write a program where the user inputs a single integer. The program should compute the square and cube of the number and display them.

// Input format :
// The input consists of a single integer n.

// Output format :
// The first line of output prints "Square of <n> is <square>" where <n> is the input integer and <square> is the square of the input number.

// The second line of output prints "Cube of <n> is <cube>" where <n> is the input integer and <cube> is the cube of the input number.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 100

// Sample test cases :
// Input 1 :
// 5
// Output 1 :
// Square of 5 is 25
// Cube of 5 is 125
// Input 2 :
// 39
// Output 2 :
// Square of 39 is 1521
// Cube of 39 is 59319


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int cube = n * n * n;

        System.out.println("Square of " + n + " is " + square);
        System.out.println("Cube of " + n + " is " + cube);
    }
}
