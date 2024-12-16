import java.util.Scanner;
public class Matrices {
    Scanner input = new Scanner(System.in);
    private int rows;
    private int columns;
    int[][]matrix1;
    int[][] matrix2;
    int[][] sumMatrix;


    public void matrices() {
        System.out.println("Enter number of rows: ");
        this.rows = input.nextInt();

        System.out.println("Enter number of columns: ");
        this.columns = input.nextInt();

       this.matrix1 = new int[this.rows][this.columns];
        this.matrix2 = new int[this.rows][this.columns];

        System.out.println("Please enter matrix1 data: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Please enter matrix2 data: ");
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.matrix2[i][j] = input.nextInt();
            }
        }
    }

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

        public void matrixSubtraction() {
            int[][] sumMatrix = new int[this.rows][this.columns];

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
