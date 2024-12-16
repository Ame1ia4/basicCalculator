import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrices matrices = new Matrices();

        System.out.println("Enter C for normal calculator or M for Matrices calculator: ");
        String calculatorType = input.nextLine();

        if (calculatorType.equals("C")) {
            System.out.println("Enter calculation here: ");
            String userInput = input.nextLine();
            Calculation calc = new Calculation(userInput);

            ArrayList<String> splitInput = calc.StringSplit3();

            for (String a : splitInput) {
                System.out.println(a);
            }
            symbolRecognition.recognition(splitInput);

        } else if (calculatorType.equals("M")) {
            matrices.matrices();

            System.out.println("Enter calculation operand:(+,-,/,*) ");
            String operand = input.nextLine();

            if (operand.equals("+")) {
                matrices.matrixAddition();
            } else if (operand.equals("-")) {
                matrices.matrixSubtraction();
            }

        }
    }
}

