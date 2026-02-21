// Single File Programming Question
// Problem Statement



// Meet Alex, an enthusiastic developer working on a project. Alex needs to create a program that keeps track of button presses. The challenge is to utilize the "this" keyword to increment the count every time the button is pressed. The program should allow Sarah to input the number of button presses and, using "this," display the final count.

// Input format :
// The input contains an integer 'n', representing the number of button presses.

// Output format :
// The output displays "Final Count: " followed by an integer value representing the button press count.

// If the negative value is provided as an input, it displays the default output "Final Count: 0 "



// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// -100000000 ≤ n ≤ 100000000

// Sample test cases :
// Input 1 :
// 20
// Output 1 :
// Final Count: 20
// Input 2 :
// -100
// Output 2 :
// Final Count: 0
// Note :






import java.util.Scanner;

class IncrementalCounter {

    int count;

    void increment() {
        this.count++;
    }

    int getCount() {
        return this.count;
    }
}

public class MainApp {
    public static void main(String[] args) {
        IncrementalCounter counter = new IncrementalCounter();
        Scanner scanner = new Scanner(System.in);
        int numIncrements = scanner.nextInt();

        if (numIncrements > 0) {
            for (int i = 0; i < numIncrements; i++) {
                counter.increment();
            }
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}
