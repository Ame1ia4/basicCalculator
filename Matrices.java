import java.util.Scanner;
public class Matrices {
    Scanner input = new Scanner(System.in);
    //Creates object for the matrix classes being called
    MatricesMultiplication matricesMultiplication = new MatricesMultiplication();
    MatrixAdditionSubtraction matrixAdditionSubtraction = new MatrixAdditionSubtraction();

    //method used to decide which matrix calculation the program is performing
    public void matrixFunction(){
        System.out.println("Enter calculation operand:(+,-,*) ");
        String operand = input.nextLine();
//
         //checks operand and calls the corresponding matrices input method and calculation method
        if (operand.equals("+")) {
            matrixAdditionSubtraction.matrices();
            matrixAdditionSubtraction.matrixAddition();
        } else if (operand.equals("-")) {
            matrixAdditionSubtraction.matrices();
            matrixAdditionSubtraction.matrixSubtraction();
        } else if (operand.equals("*")) {
            matricesMultiplication.matrices();
            matricesMultiplication.matrixMultiplication();
        }
    }

}
