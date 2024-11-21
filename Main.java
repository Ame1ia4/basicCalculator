import java.nio.channels.MulticastChannel;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        multiplication multiplication = new multiplication();
        division division = new division();

        System.out.println("Enter value you are manipulating here: ");
        multiplication.setFirstValue(input.nextInt());

        System.out.println("Enter manipulator: ");
        multiplication.setSecondValue(input.nextInt());

        System.out.printf("Multiplication result: %f%n", multiplication.getFirstValue());

        System.out.println("Enter value you are dividing here: ");
        division.setFirstInput(input.nextInt());

        System.out.println("Enter divisor: ");
        division.setSecondInput(input.nextInt());

        System.out.printf("Division result: %f%n", division.getFirstInput());
    }



}
