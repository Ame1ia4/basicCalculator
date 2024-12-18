import java.util.Scanner;
public class MatrixAdditionSubtraction extends MatricesMultiplication {
    Scanner input = new Scanner(System.in);
    private int rows;
    private int columns;
    int[][]matrix1;
    int[][] matrix2;
    int[][] sumMatrix;
    //initialises instance variables

    //overrides parent class method matrices to change input of rows and columns
    public void matrices() {
        System.out.println("Enter number of rows: ");
        this.rows = input.nextInt();

        System.out.println("Enter number of columns: ");
        this.columns = input.nextInt();

        //initialises matrices, 2d arrays
       this.matrix1 = new int[this.rows][this.columns];
        this.matrix2 = new int[this.rows][this.columns];

        //this for loop iterates through the 2d array, assigning the position of variables for matrix1
        System.out.println("Please enter matrix1 data: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix1[i][j] = input.nextInt();
            }
        }

        //this for loop iterates through the 2d array, assigning the position of variables for matrix2
        System.out.println("Please enter matrix2 data: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix2[i][j] = input.nextInt();
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




        //2nd matrix
    //enter calculation type
    // call method that calculates matrix1 and matrix2
    // ArrayList<Double> matrix = new ArrayList<Double>(double rows, double columns);?
//Method…

