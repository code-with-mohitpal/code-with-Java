// Single File Programming Question
// Problem statement



// John, a diligent student, eagerly awaits his exam results. He has taken three subjects and needs to know how he performed. Assist him by writing a program that takes his marks in these subjects, and determines average marks, highest marks, and lowest marks based on choices.

// Input format :
// The first line of input contains an integer representing the mark of the first subject.

// The second line of input contains an integer representing the mark of the second subject.

// The third line of input contains an integer representing the mark of the third subject.

// The last line of input represents the choices (1 - Average marks, 2 - Highest Marks, 3 - Lowest Marks).

// Output format :
// The output prints the result based on choices.

// if the choice is 1, the output prints "Average Marks: " followed by the calculated (double value with 1 decimal) average marks.

// If the choice is 2, the output prints "Highest Marks: " followed by the (double value with 1 decimal) highest marks.

// If the choice is 3, the output prints "Lowest marks: " followed by the (double value with 1 decimal) lowest marks.



// Refer to sample outputs for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ marks of subject ≤ 100

// Sample test cases :
// Input 1 :
// 62
// 77
// 57
// 1
// Output 1 :
// Average Marks: 65.3
// Input 2 :
// 98
// 95
// 92
// 2
// Output 2 :
// Highest Marks: 98.0
// Input 3 :
// 46
// 52
// 50
// 3
// Output 3 :
// Lowest Marks: 46.0



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int choice = sc.nextInt();

        double average = (m1 + m2 + m3) / 3.0;
        double highest = Math.max(m1, Math.max(m2, m3));
        double lowest = Math.min(m1, Math.min(m2, m3));

        switch (choice) {
            case 1:
                System.out.printf("Average Marks: %.1f%n", average);
                break;
            case 2:
                System.out.printf("Highest Marks: %.1f%n", highest);
                break;
            case 3:
                System.out.printf("Lowest Marks: %.1f%n", lowest);
                break;
        }

        sc.close();
    }
}
