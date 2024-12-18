import java.util.ArrayList;

public class BIMDAS {

    //creates static method orderOfOps, which takes in variable splitInput - method ensures order of operations is done correctly
    public static String orderOfOps(ArrayList<String> splitInput) {

        //creates Brackets object under Calculation since Brackets is a subclass of Calculation
        Calculation calculator = new Brackets(splitInput);
        while(calculator.getExpression().contains("(")){
            //checks for brackets in the users calculation input
            calculator = new Brackets(calculator.calculate());//while brackets are present calculator calls Brackets calculate method
        }
        //this section runs through all of our operation classes in order of operations
        calculator = new Powers(calculator.calculate());
        calculator = new MultiplyDivide(calculator.calculate());
        calculator = new AddSubtract(calculator.calculate());
        calculator.calculate();//calls calculate method for AddSubtract
        return calculator.getFinal();//returns final result for program, the first element of an index
    }
}

