import java.util.ArrayList;
import java.util.Collections;

public class AddSubtract extends Calculation {

    AddSubtract(ArrayList<String> expression){
        super(expression);
        super.expression = expression;
    }
    public ArrayList<String> calculate() {
        Collections.reverse(expression);

        for (int i = expression.size() - 1; i >= 0; i--) {
            try {
                if (expression.get(i).equals("+")) {
                    expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) + Double.parseDouble(expression.get(i - 1))));
                    expression.remove(i + 1);
                    expression.remove(i);

                } else if (expression.get(i).equals("-")) {

                    expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) - Double.parseDouble(expression.get(i - 1))));
                    expression.remove(i + 1);
                    expression.remove(i);
                }


            } catch (NumberFormatException e) {
                System.out.println("!Error! Values entered must be numeric! Please try again.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("!Error! Invalid Index.. Check Input structure and try again.");
            } catch (Exception e) {
                System.out.println("!Unknown Error!:" + e.getMessage());


            }


        }
        Collections.reverse(expression);
        return expression;

    }
}