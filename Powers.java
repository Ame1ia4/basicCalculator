import java.util.ArrayList;
import java.util.Collections;

public class Powers extends Calculation {

    Powers(ArrayList<String> expression) {
        super(expression);
    }

    @Override
    public ArrayList<String> calculate() {
        Collections.reverse(expression);
        for (int i = expression.size() - 1; i >= 0; i--) {
            try {

                if (expression.get(i).equals("^")) {

                    double base = Double.parseDouble(expression.get(i + 1));
                    int exponent = Integer.parseInt(expression.get(i - 1));


                    double result = 1;
                    if (exponent < 0) {
                        for (int j = 0; j < exponent*(-1); j++) {
                            result *= base;
                        }
                        expression.set(i + 1, "1");
                        expression.set(i,"/");
                        expression.set(i-1,String.format("%f",result));

                    }
                    else {
                        for (int j = 0; j < exponent; j++) {
                            result *= base;
                        }
                        expression.set(i - 1, Double.toString(result));
                        expression.remove(i + 1);
                        expression.remove(i);
                    }
                    if (Double.isInfinite(result)) {
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
        Collections.reverse(expression);
        return expression;
    }
}