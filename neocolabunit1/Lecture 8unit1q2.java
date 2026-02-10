// Problem Statement



// Maria is building a program to classify triangles based on side lengths. The program should take three integer inputs and identify if the triangle is equilateral, isosceles, scalene, or right-angled. Help Maria create this classification program.



// Note: Equilateral - all sides equal; Isosceles - two sides equal; Scalene - all sides different. The square of one side equals the sum of the squares of the other two sides, for a triangle to be right-angled.

// Input format :
// The input consists of three space-separated integers, representing the lengths of the sides of the triangle.

// Output format :
// The output should display the type of triangle ("equilateral", "isosceles" or "scalene").

// "The triangle is <type>"

// If it is right-angled

// "The triangle is also right-angled"



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ sides of triangle ≤ 100

// Sample test cases :
// Input 1 :
// 4 13 15
// Output 1 :
// The triangle is scalene
// Input 2 :
// 5 5 7
// Output 2 :
// The triangle is isosceles
// Input 3 :
// 3 3 3
// Output 3 :
// The triangle is equilateral
// Input 4 :
// 5 12 13
// Output 4 :
// The triangle is scalene
// The triangle is also right-angled

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Determine triangle type
        if (a == b && b == c) {
            System.out.println("The triangle is equilateral");
        } 
        else if (a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles");
        } 
        else {
            System.out.println("The triangle is scalene");
        }

        // Check right-angled triangle
        int x = a * a;
        int y = b * b;
        int z = c * c;

        if (x == y + z || y == x + z || z == x + y) {
            System.out.println("The triangle is also right-angled");
        }

        sc.close();
    }
}
  
