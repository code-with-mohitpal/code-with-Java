import java.util.Scanner;

class TwoDArrayInputOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input rows and columns
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        // Declare 2D array
        int[][] matrix = new int[rows][columns];

        // Input elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Output elements
        System.out.println("The elements of the 2D array are:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
