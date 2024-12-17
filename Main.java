import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatrixAdditionSubtraction matrices = new MatrixAdditionSubtraction();
        MatricesMultiplication matricesMultiplication = new MatricesMultiplication();

        System.out.println("Enter C for normal calculator, M for Matrices calculator, or m for Music Calculator: ");
        String calculatorType = input.nextLine();

        if (calculatorType.equals("C")) {
            System.out.println("Enter calculation here: ");
            String userInput = input.nextLine();
            Parsing calc = new Parsing(userInput);

            ArrayList<String> splitInput = calc.StringSplit3();

            for (String a : splitInput) {
                System.out.println(a);
            }
            System.out.println(BIMDAS.recognition(splitInput));

        } else if (calculatorType.equals("M")) {
            matrices.matrixFunction();

        } else if (calculatorType.equals("m")) {

            System.out.println("What function would you like to use: (F = Frequency dB = Decibel)");
            String function = input.nextLine();

            if (function.equals("F")) {
                Frequency frequency = new Frequency();
                frequency.function();
            } else if (function.equals("dB")) {
                Decibel dB = new Decibel();
                dB.function();
            }
        }
    }
}


