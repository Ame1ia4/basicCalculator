import java.util.Scanner;
public class Matrices {
    Scanner input = new Scanner(System.in);
    MatricesMultiplication matricesMultiplication = new MatricesMultiplication();
    MatrixAdditionSubtraction matrixAdditionSubtraction = new MatrixAdditionSubtraction();

    public void matrixFunction(){
        System.out.println("Enter calculation operand:(+,-,*) ");
        String operand = input.nextLine();
//
        if (operand.equals("+")) {
            matrixAdditionSubtraction.matrixSubtraction();
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
