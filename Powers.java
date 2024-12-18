import java.util.ArrayList;
import java.util.Collections;

public class Powers extends Calculation {

    //constructor, calls super class variables and initialises them
    public Powers(ArrayList<String> expression) {
        super(expression);
    }

    //overrides Calculation method calculate
    @Override
    public ArrayList<String> calculate() {
        Collections.reverse(expression); // reverses expression

        //for loop iterates through calculation array and examines every element
        for (int i = expression.size() - 1; i >= 0; i--) {
            try {
                if (expression.get(i).equals("^")) { // finds position of ^ in the array

                    double base = Double.parseDouble(expression.get(i + 1)); //sets base to index (i+1)
                    double exponent = Double.parseDouble(expression.get(i - 1)); //sets exponent to index (i-1)


                    double result = 1; //sets result to 1
                    if (exponent % 1 != 0){ // checks if the remainder is = 0 if not then exponent is a decimal
                        result = Math.pow(base,exponent); //calls class Math's method .pow on base and exponent to calculate the decimal power
                        expression.set(i - 1, Double.toString(result));// sets result
                        expression.remove(i + 1);//removes leftover indices elements
                        expression.remove(i);//removes leftover indices element

                    }
                    else if (exponent < 0) { // checks if exponent is a negative
                        for (int j = 0; j < exponent*(-1); j++) {
                            result *= base;//since result=1 and for loop iterates through number of times the exponent demands, the result increases with the base and multiplies
                            // giving the final result of our power calculation
                        }
                        expression.set(i + 1, "1");
                        expression.set(i,"/");
                        expression.set(i-1,String.format("%f",result));
                        //this sets the result to 1 divided by the result = so we get the negative result

                    }
                    else {
                        for (int j = 0; j < exponent; j++) {
                            result *= base;//since result=1 and for loop iterates through number of times the exponent demands, the result increases with the base and multiplies
                            //giving the final result of our power calculation
                        }
                        expression.set(i - 1, Double.toString(result));//sets result to index point i-1
                        expression.remove(i + 1);//removes leftover indices elements
                        expression.remove(i);//removes leftover indices elements
                    }
                    if (Double.isInfinite(result)) {//if result is infinite, program throws an exception
                        throw new ArithmeticException("The result is too large.");
                    }
                }

            } catch (NumberFormatException e) {
                System.err.println("!Error! Values entered must be numeric! Please try again.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("!Error! Invalid Index. Check input structure and try again.");
            } catch (ArithmeticException e) {
                System.out.println("!Math Error! " + e.getMessage());
            } catch (Exception e) {
                System.out.println("!Unknown Error! " + e.getMessage());
            }
        }
        Collections.reverse(expression);//reverses the expression
        return expression;
    }
}