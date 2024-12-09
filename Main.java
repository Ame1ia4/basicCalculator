import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value you are adding to here: ");
        String userInput = input.nextLine();
        Calculation calc = new Calculation(userInput);

        ArrayList<String> splitInput = calc.StringSplit3();

        for(String a: splitInput){
            System.out.println(a);
        }

      symbolRecognition.recognition(splitInput);
    }
}
