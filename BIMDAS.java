import java.util.ArrayList;

public class BIMDAS {


    public static String orderOfOps(ArrayList<String> splitInput) {

        Calculation calculator = new Brackets(splitInput);
        while(calculator.getExpression().contains("(")){
            calculator = new Brackets(calculator.calculate());
        }
        calculator = new Powers(calculator.calculate());
        calculator = new MultiplyDivide(calculator.calculate());
        calculator = new AddSubtract(calculator.calculate());
        calculator.calculate();
        return calculator.getFinal();
    }
}

