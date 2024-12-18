import java.util.Scanner;
import java.util.InputMismatchException;

public class MatricesMultiplication {
    Scanner input = new Scanner(System.in);
    private int rows;
    private int column1row2;
    private int columns2;
    int[][] matrix1;
    int[][] matrix2;
    int[][] product;

    // Method to input number of rows, columns, and data in matrix 1 and 2.
    public void matrices() {
        boolean validInput;

        // Ensure the number of rows is a positive integer
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter number of rows: ");
                this.rows = input.nextInt();
                if (this.rows > 0) {
                    validInput = true;
                } else {
                    System.out.println("!Error! The number of rows must be a positive integer. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("!Error! Please enter a valid positive integer.");
                input.nextLine(); // Clear invalid input
            }
        }

        // Ensure the number of columns in matrix 1 and rows in matrix 2 is a positive integer
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter number of columns in first matrix and rows in matrix 2: ");
                this.column1row2 = input.nextInt();
                if (this.column1row2 > 0) {
                    validInput = true;
                } else {
                    System.out.println("!Error! The number must be a positive integer. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("!Error! Please enter a valid positive integer.");
                input.nextLine(); // Clear invalid input
            }
        }

        // Ensure the number of columns in matrix 2 is a positive integer
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter number of columns in the second matrix: ");
                this.columns2 = input.nextInt();
                if (this.columns2 > 0) {
                    validInput = true;
                } else {
                    System.out.println("!Error! The number of columns must be a positive integer. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("!Error! Please enter a valid positive integer.");
                input.nextLine(); // Clear invalid input
            }
        }

        // Check if the number of columns in matrix 1 matches the number of rows in matrix 2
        if (this.rows != this.column1row2) {
            throw new IllegalArgumentException("!Error! The number of columns in the first matrix must equal the number of rows in the second matrix. Please try again");
        }

        // Initializing the matrices
        this.matrix1 = new int[this.rows][this.column1row2];
        this.matrix2 = new int[this.column1row2][this.columns2];

        // Input data for the first matrix
        System.out.println("Enter data for the first matrix: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.column1row2; j++) {
                boolean validEntry = false;
                while (!validEntry) {
                    try {
                        System.out.print("Enter value for matrix1[" + i + "][" + j + "]: ");
                        this.matrix1[i][j] = input.nextInt();
                        validEntry = true;
                    } catch (InputMismatchException e) {
                        System.out.println("!Error! Values entered must be numeric. Please try again.");
                        input.nextLine(); // Clear invalid input
                    }
                }
            }
        }

        // Input data for the second matrix
        System.out.println("Enter data for the second matrix: ");
        for (int i = 0; i < this.column1row2; i++) {
            for (int j = 0; j < this.columns2; j++) {
                boolean validEntry = false;
                while (!validEntry) {
                    try {
                        System.out.print("Enter value for matrix2[" + i + "][" + j + "]: ");
                        this.matrix2[i][j] = input.nextInt();
                        validEntry = true;
                    } catch (InputMismatchException e) {
                        System.out.println("!Error! Values entered must be numeric. Please try again.");
                        input.nextLine(); // Clear invalid input
                    }
                }
            }
        }
    }

    // Method to perform matrix multiplication
    public void matrixMultiplication() {
        this.product = new int[this.rows][this.columns2]; // Initializing product matrix

        System.out.println("Product of multiplication:");
        // Loop to perform the matrix multiplication
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns2; j++) {
                for (int k = 0; k < column1row2; k++) {
                    // Perform matrix multiplication and store in product matrix
                    this.product[i][j] += this.matrix1[i][k] * this.matrix2[k][j];
                }
                // Print the result with tab spacing
                System.out.print(this.product[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

