import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;


public class MultiplyDivide extends Calculation {

    MultiplyDivide(ArrayList<String> expression){
        super(expression);

    }

    @Override
    public ArrayList<String> calculate() {
        Collections.reverse(expression);//expression is reversed
        try { //Put logic in try block so error handling can be done at end with catch blocks
            for (int i = expression.size() - 1; i >= 0; i--) {//for loop iterates through calculation array and examines every element
                if (expression.get(i).equals("/")) {//if index position i = "/"
                    // Divide by zero error handler
                    if (Double.parseDouble(expression.get(i - 1)) == 0) {
                        throw new ArithmeticException("!Error! Divisor cannot equal to zero. Please try again!");
                    }

                    //sets index position i-1 to result of division between i+1 and i-1
                    expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) / Double.parseDouble(expression.get(i - 1))));
                    expression.remove(i + 1);//removes leftover indices element
                    expression.remove(i);//removes leftover indices element
                }
                else if (expression.get(i).equals("*")) {//if index position i = "*"
                    //sets index position i-1 to result of multiplication between i+1 and i-1
                    expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) * Double.parseDouble(expression.get(i - 1))));
                    expression.remove(i + 1);//removes leftover indices element
                    expression.remove(i);//removes leftover indices element
                }
            }
            Collections.reverse(expression);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("!Error! Values entered must be numeric. Please try again!");
        }

        return expression;//returns result of multiplication and/or division
    }

}





