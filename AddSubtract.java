import java.util.ArrayList;
import java.util.Collections;

public class AddSubtract extends Calculation {

    //constructor that sets the expression from the Calculation Super class
    AddSubtract(ArrayList<String> expression){
        super(expression);
    }

    @Override//overrides the abstract calculate methods
    public ArrayList<String> calculate() {
        //reverse the expression for ease of use while removing from array lists while iterating
        Collections.reverse(expression);

        //for loop that starts at the end of the expression since it is reversed and checks for "-" and "+"
        for (int i = expression.size() - 1; i >= 0; i--) {
            try {
                //if the element is a "+"
                if (expression.get(i).equals("+")) {
                    //makes the value before the + sign the result of the addition if the expression wasnt reversed
                    expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) + Double.parseDouble(expression.get(i - 1))));
                    expression.remove(i + 1);//removes the now obsolete number
                    expression.remove(i);// removes the addition sign
                } else if (expression.get(i).equals("-")) {
                    if(i == expression.size() - 1 && Parsing.isNumeric(expression.get(i-1)) ){
                        expression.set(expression.size()-1,Double.toString(Double.parseDouble(expression.get(i-1)) * (-1)));
                        expression.remove(i-1);
                    }
                    //---5  5---
                    else if (!Parsing.isNumeric(expression.get(i+1))){
                        expression.set(i,Double.toString(Double.parseDouble(expression.get(i-1)) * (-1)));
                        expression.remove(i-1);
                    }
                    else {
                        expression.set(i - 1, Double.toString(Double.parseDouble(expression.get(i + 1)) - Double.parseDouble(expression.get(i - 1))));
                        expression.remove(i + 1);
                        expression.remove(i);
                    }
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