import java.util.Scanner;
import java.util.InputMismatchException;

public class MatrixAdditionSubtraction extends MatricesMultiplication {
    Scanner input = new Scanner(System.in);
    private int rows;
    private int columns;
    int[][] matrix1;
    int[][] matrix2;
    int[][] sumMatrix;
    //initialises instance variables

    //overrides parent class method matrices to change input of rows and columns
    public void matrices() {
        boolean validInput;

        // Ensure the number of rows is a positive integer
        validInput = false;
        while (!validInput) {
            System.out.println("Enter number of rows: ");
            this.rows = input.nextInt();
            if (this.rows > 0) {
                validInput = true;
            } else {
                System.out.println("!Error! Number of rows must be a positive integer. Please try again.");
            }
        }

        // Ensure the number of columns is a positive integer
        validInput = false;
        while (!validInput) {
            System.out.println("Enter number of columns: ");
            this.columns = input.nextInt();
            if (this.columns > 0) {
                validInput = true;
            } else {
                System.out.println("!Error! Number of columns must be a positive integer. Please try again.");
            }
        }

        //initialises matrices, 2d arrays
        this.matrix1 = new int[this.rows][this.columns];
        this.matrix2 = new int[this.rows][this.columns];

        //this for loop iterates through the 2d array, assigning the position of variables for matrix1
        System.out.println("Please enter matrix1 data: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                boolean validEntry = false;
                while (!validEntry) {
                    try {
                        System.out.print("Enter value for matrix1[" + i + "][" + j + "]: ");
                        this.matrix1[i][j] = input.nextInt();
                        validEntry = true;
                    } catch (InputMismatchException e) {
                        System.out.println("!Error! Values entered must be numeric. Please try again!");
                        input.nextLine(); // Clear the invalid input
                    }
                }
            }
        }

        //this for loop iterates through the 2d array, assigning the position of variables for matrix2
        System.out.println("Please enter matrix2 data: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                boolean validEntry = false;
                while (!validEntry) {
                    try {
                        System.out.print("Enter value for matrix2[" + i + "][" + j + "]: ");
                        this.matrix2[i][j] = input.nextInt();
                        validEntry = true;
                    } catch (InputMismatchException e) {
                        System.out.println("!Error! Values entered must be numeric. Please try again!");
                        input.nextLine(); // Clear the invalid input
                    }
                }
            }
        }
    }

    //method to add matrices together and print out sum matrix
    public void matrixAddition() {
        this.sumMatrix = new int[this.rows][this.columns];

        System.out.println("Matrix Calculation: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.sumMatrix[i][j] = this.matrix1[i][j] + this.matrix2[i][j];
                System.out.print(this.sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //method to subtract matrices and print out sum matrix
    public void matrixSubtraction() {
        this.sumMatrix = new int[this.rows][this.columns];

        System.out.println("Matrix Calculation: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.sumMatrix[i][j] = this.matrix1[i][j] - this.matrix2[i][j];
                System.out.print(this.sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



