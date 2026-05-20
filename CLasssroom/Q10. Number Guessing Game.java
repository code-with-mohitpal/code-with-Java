// Q10. Number Guessing Game

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = 25;

        while (true) {

            System.out.print("Guess the number: ");
            int guess = sc.nextInt();

            if (guess > secretNumber) {

                System.out.println("Too high");
            }

            else if (guess < secretNumber) {

                System.out.println("Too low");
            }

            else {

                System.out.println("Correct Guess");
                break;
            }
        }
    }
}
