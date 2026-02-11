// Single File Programming Question
// Problem Statement



// Sarah is organizing a picnic and needs to determine if the number of sandwiches or drinks she packs is divisible by 4 for easy distribution. She wants to write a program where the user inputs two integers: the number of sandwiches and the number of drinks. The program should check if at least one of these numbers is divisible by 4. 



// Assist Sarah in this programming task.

// Input format :
// The input consists of two space-separated integers n and m, representing the number of sandwiches and the number of drinks.

// Output format :
// The output prints a boolean value (true or false) indicating whether at least one of the two numbers is divisible by 4.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ n, m ≤ 1000

// Sample test cases :
// Input 1 :
// 56 12
// Output 1 :
// true
// Input 2 :
// 66 81
// Output 2 :
// false
// Input 3 :
// 64 75
// Output 3 :
// true
// Note :


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((n % 4 == 0) || (m % 4 == 0));
    }
}
