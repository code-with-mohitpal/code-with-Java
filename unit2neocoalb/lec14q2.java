import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        int firstIndex = str.indexOf(ch);
        int lastIndex = str.lastIndexOf(ch);

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + ch + ": " + firstIndex);
            System.out.println("Last occurrence of " + ch + ": " + lastIndex);
        } else {
            System.out.println(ch + " not found in the string");
        }

        sc.close();
    }
}




// Single File Programming Question
// Problem Statement



// ﻿In a content management system, imagine you are tasked with developing a search functionality for users to find the first and last occurrences of a specific character within a word. 



// How would you implement a program to efficiently locate and display these positions within the text, improving the user's reading experience?

// Input format :
// The first line of input contains a string.

// The second line of input contains a single character ch to be searched in the string.

// Output format :
// If the character is found in the string, the output prints:

// First occurrence of ch: <index>

// Last occurrence of ch: <index>

// If the character is not found, the output prints "ch not found in the string"



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given testcases fall under the following constraints:

// 1 ≤ length of the string ≤ 1000

// The search character ch is a single character

// String comparison is case-sensitive

// Indexing starts from 0

// String may contain uppercase,lowercase,special characters and spaces.

// Sample test cases :
// Input 1 :
// Hello, World!
// r
// Output 1 :
// First occurrence of r: 9
// Last occurrence of r: 9
// Input 2 :
// This is a test string.
// i
// Output 2 :
// First occurrence of i: 2
// Last occurrence of i: 18
// Input 3 :
// Lemon
// l
// Output 3 :
// l not found in the string
// Note :
