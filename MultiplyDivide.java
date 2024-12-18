import java.util.ArrayList;
import java.util.Collections;

public class MultiplyDivide extends Calculation {

    MultiplyDivide(ArrayList<String> expression){
        super(expression);

    }

    @Override
    public ArrayList<String> calculate() {
        Collections.reverse(expression);
        try { //Put logic in try block so error handling can be done at end with catch blocks
            for (int i = expression.size() - 1; i >= 0; i--) {//for loop iterates through calculation array and finds size
                if (expression.get(i).equals("/")) {//if index position i = /
                    // Div by zero error handler
                    if (Double.parseDouble(expression.get(i - 1)) == 0) {
                        throw new ArithmeticException("Divisor cannot equal to zero. Please try again!");
                    }

                    expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) / Double.parseDouble(expression.get(i - 1))));
                    expression.remove(i + 1);
                    expression.remove(i);
                }
                else if (expression.get(i).equals("*")) {
                    expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) * Double.parseDouble(expression.get(i - 1))));
                    expression.remove(i + 1);
                    expression.remove(i);
                }
            }
            Collections.reverse(expression);
        } catch (ArithmeticException e) {
            System.out.println("!Math Error!"+e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("!Format Error!" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!Index Error!" + e.getMessage());
        }
        return expression;

    }

}





