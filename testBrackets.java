import java.util.Scanner;

public class testBrackets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        Parsing parsedExpression = new Parsing(userInput);
        Brackets bracketTest = new Brackets(parsedExpression.StringSplit3());
        bracketTest.calculate();
    }
}
