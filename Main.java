import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//creates Scanner object
        Matrices matrices = new Matrices();//creates matrices object
        boolean continueLoop = true;
        while (continueLoop) {

            //set up boolean to control while loop
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Enter C for normal calculator, M for Matrices calculator, m for Music Calculator, or E to break: ");//prints out options for calculator the user can choose, prompts the user to type calculator choice
                    String calculatorType = input.nextLine();//next input will equal String calculatortype

                    if (!calculatorType.equals("C") && !calculatorType.equals("M") && !calculatorType.equals("m") && !calculatorType.equals("E")) {
                        throw new IllegalArgumentException("!Error! You must select one of the options above. Please press enter to try again!");
                    }
                    validInput = true;

                    switch (calculatorType) {//switch case for calculatorType
                        case "C" -> {//if calculatorType equals "C"
                            System.out.println("Enter calculation here: ");//Prompts user to enter calculation String
                            String userInput = input.nextLine();//next input will equal String userInput
                            Parsing calc = new Parsing(userInput);//creates new Parsing object which takes in variable userInput

                            ArrayList<String> parsedInput = calc.StringSplit();//creates arraylist object called parsedInput which calls method StringSplit on userInput


                            System.out.println("Answer: " + BIMDAS.orderOfOps(parsedInput));//prints result after user input has been passed through parsing and had the operations classes called on it
                        }
                        //if calculatorType equals "M"
                        case "M" -> matrices.matrixFunction();
                        //if calculatorType equals "m"
                        case "m" -> {
                            boolean validFunction = false;
                            while (!validFunction) {
                                try {
                                    System.out.println("What function would you like to use: (F = Frequency dB = Decibel)");//Prompts the user to choose and input which function they would like to use
                                    String function = input.nextLine();//next input will equal String function

                                    if (!function.equals("F") && !function.equals("dB")) {
                                        throw new IllegalArgumentException("!Error! You must select one of the options above. Please press enter to try again!");
                                    }
                                    if (function.equals("F")) {//if string function equals "F"
                                        //calls frequency function method
                                        MusicFunctions musicFunctions = new Frequency();
                                        musicFunctions.function();
                                    } else if (function.equals("dB")) {//if string function equals "dB"
                                        //calls decibel function method
                                        MusicFunctions musicFunctions = new Decibel();
                                        musicFunctions.function();
                                    }
                                    validFunction = true;
                                } catch (IllegalArgumentException e) {
                                    System.out.println(e.getMessage());
                                    input.nextLine();
                                }
                            }
                        }
                        case "E" -> {
                            continueLoop = false;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    input.nextLine();
                }
            }
        }
    }
}



