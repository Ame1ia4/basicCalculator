import java.util.ArrayList;

public class BIMDAS {


    public static String recognition(ArrayList<String> splitInput) {
        Calculation calculator = new Brackets(splitInput);
        while(splitInput.contains("(")){
            calculator.calculate();
        }
        calculator = new MultiplyDivide(calculator.calculate());
        calculator = new AddSubtract(calculator.calculate());
        calculator.calculate();
        return calculator.getFinal();
    }
}
