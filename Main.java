import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrices matrices = new Matrices();

        System.out.println("Enter C for normal calculator, M for Matrices calculator, or m for Music Calculator: ");
        String calculatorType = input.nextLine();

        if (calculatorType.equals("C")) {
            System.out.println("Enter calculation here: ");
            String userInput = input.nextLine();
            Calculations calc = new Calculations(userInput);

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

        } else if (calculatorType.equals("m")) {

            System.out.println("Insert number of cycles and cycle completion time(seconds) here: ");
          Frequency frequency = new Frequency(input.nextDouble(), input.nextDouble());
          frequency.frequencyConversion();
        }
    }
}


