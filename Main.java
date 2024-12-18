import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrices matrices = new Matrices();

        System.out.println("Enter C for normal calculator, M for Matrices calculator, or m for Music Calculator: ");
        String calculatorType = input.nextLine();

        switch (calculatorType) {
            case "C" -> {
                System.out.println("Enter calculation here: ");
                String userInput = input.nextLine();
                Parsing calc = new Parsing(userInput);

                ArrayList<String> parsedInput = calc.StringSplit();


                System.out.println("Answer: " + BIMDAS.orderOfOps(parsedInput));
            }
            case "M" -> matrices.matrixFunction();
            case "m" -> {

                System.out.println("What function would you like to use: (F = Frequency dB = Decibel)");
                String function = input.nextLine();

                if (function.equals("F")) {
                    //calls frequency function method
                    MusicFunctions musicFunctions = new Frequency();
                    musicFunctions.function();
                } else if (function.equals("dB")) {
                    //calls decibel function method
                    MusicFunctions musicFunctions = new Decibel();
                    musicFunctions.function();
                }
            }
        }
    }
}


