import java.util.Scanner;

public class Main {

    public static int findMissingID(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int expected = 1; // IDs start from 1

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != expected) {
                    return expected; // Found the missing ID
                }
                expected++;
            }
        }

        return -1; // No missing ID found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix size input from user
        System.out.print("Enter the size of the matrix (n for n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements row by row (missing one number from 1 to " + (n * n) + "):");

        // Input matrix values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Find and print the missing ID
        int missingID = findMissingID(matrix);
        if (missingID != -1) {
            System.out.println("Missing ID is: " + missingID);
        } else {
            System.out.println("No ID is missing.");
        }

        scanner.close();
    }
}
