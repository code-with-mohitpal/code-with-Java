// Single File Programming Question
// Problem Statement



// Oliver is creating a mathematical tool to calculate the product of all non-zero digits in a given number. He wants to develop a program that reads an integer input, uses a for-each loop to iterate through each digit, and computes the product of the non-zero digits.



// Can you assist Oliver in this?

// Input format :
// The input consists of a single integer n, representing the number for which Oliver wants to calculate the product of all non-zero digits.

// Output format :
// The output prints an integer representing the product of all non-zero digits in the given integer.



// Refer to the sample output for formatting specifications.﻿

// Code constraints :
// The given testcases fall under the following constraints:

// 1 ≤ n ≤ 1010

// Sample test cases :
// Input 1 :
// 1089
// Output 1 :
// 72
// Input 2 :
// 123
// Output 2 :
// 6
// Input 3 :
// 50140
// Output 3 :
// 20
// Note :  



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int product = 1;
        boolean hasNonZero = false;

        for (char ch : n.toCharArray()) {
            int digit = ch - '0';
            if (digit != 0) {
                product *= digit;
                hasNonZero = true;
            }
        }

        if (hasNonZero) {
            System.out.println(product);
        } else {
            System.out.println(0);
        }
    }
}
