import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Subtraction subtraction = new Subtraction();

        System.out.println("Enter value you are adding to here: ");
        addition.setFirstInput(input.nextInt());

        System.out.println("Enter value you are adding here : ");
        addition.setSecondInput(input.nextInt());

        System.out.printf("Addition result: %f%n", addition.getFirstInput());

        System.out.println("Enter value you are subtracting from here: ");
        subtraction.setFirstInput(input.nextInt());

        System.out.println("Enter subtracting value here: ");
        subtraction.setSecondInput(input.nextInt());

        System.out.printf("Subtraction result: %f%n", subtraction.getFirstInput());

        System.out.println("Enter value you are manipulating here: ");
        multiplication.setFirstInput(input.nextInt());

        System.out.println("Enter manipulator: ");
        multiplication.setSecondInput(input.nextInt());

        System.out.printf("Multiplication result: %f%n", multiplication.getFirstInput());

        System.out.println("Enter value you are dividing here: ");
        division.setFirstInput(input.nextInt());

        System.out.println("Enter divisor: ");
        division.setSecondInput(input.nextInt());

        System.out.printf("Division result: %f%n", division.getFirstInput());
    }





}
