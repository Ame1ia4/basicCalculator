import  java.util.Scanner;
public class MatricesMultiplication{
    Scanner input = new Scanner(System.in);
    private int rows;
    private int column1row2;
    private int columns2;
    int[][]matrix1;
    int[][] matrix2;
    int[][] product;
    //all instance variables are declared so that they are accessible to all other methods within class

    // method to input number of rows, columns, and data in matrix 1 and 2.
    public void matrices(){
        System.out.println("Enter number of rows: ");
        this.rows = input.nextInt();
    //columns of matrix 1 and rows of matrix 2 must be identical to multiply, therefore the 2 are combined
        System.out.println("Enter number of columns in first matrix and rows in matrix 2: ");
        this.column1row2 = input.nextInt();

        System.out.println("Enter number of rows in the second matrix: ");
        this.columns2 = input.nextInt();

        //initialising the matrices
        this.matrix1 = new int[this.rows][this.column1row2];
        this.matrix2 = new int[this.column1row2][this.columns2];

        System.out.println("Enter data for the first matrix: ");

        //this for loop iterates through the 2d array, assigning the position of variables for matrix1
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.column1row2; j++) {
                this.matrix1[i][j] = input.nextInt();
            }
        }

        //this for loop iterates through the 2d array, assigning the position of variables for matrix2
        System.out.println("Enter data for the first matrix: ");
        for (int i = 0; i < this.column1row2; i++) {
            for (int j = 0; j < this.columns2; j++) {
                this.matrix2[i][j] = input.nextInt();
            }
        }

    }

    public void matrixMultiplication() {
      this.product = new int[this.rows][this.columns2];//initialises product matrices


        System.out.println("Product of multiplication");
        // for loop iterates through rows and columns, assigning positions within matrices
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns2; j++) {
                for (int k = 0; k < column1row2; k++) {
                    //matrices multiply to produce product matrices and is then printed out
                    this.product[i][j] += this.matrix1[i][k] * this.matrix2[k][j];
                    //Prints to terminal, tabs in between indices to space them out
                    System.out.print(this.product[i][j] + "\t");
                }
                System.out.println();
                }
            }
        }
    }


//this.sumMatrix = super.sumMatrix;

