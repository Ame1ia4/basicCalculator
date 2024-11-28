import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Subtraction subtraction = new Subtraction();


        System.out.println("Enter value you are adding to here: ");
        String userInput = input.nextLine();
        Calculation calc = new Calculation(userInput);

        String[] splitInput = calc.StringSplit();

        for(String a: splitInput){
            System.out.println(a);
        }



    }





}
