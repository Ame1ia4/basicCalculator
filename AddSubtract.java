import java.util.ArrayList;
import java.util.Collections;

public class AddSubtract extends Calculation {

    //constructor that sets the expression from the Calculation Super class
    AddSubtract(ArrayList<String> expression){
        super(expression);
        super.expression = expression;
    }@Override //overrides the abstract calculate methods
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
                    expression.remove(i + 1);
                    expression.remove(i);

                } //if the element is a "-"
                else if (expression.get(i).equals("-")) {
                    //if the last element of the reversed array is a "-" and the next element is a number
                    // or if the element after the "-" in the reversed array is not a number then it will multipy the previous number by -1
                    if(i == expression.size() - 1 && Parsing.isNumeric(expression.get(i-1)) ){
                        //sets the - element to the number * -1
                        expression.set(expression.size()-1,Double.toString(Double.parseDouble(expression.get(i-1)) * (-1)));
                        expression.remove(i-1);
                    }
                    //---5  5---
                    else if (!Parsing.isNumeric(expression.get(i+1))){
                        expression.set(i,Double.toString(Double.parseDouble(expression.get(i-1)) * (-1)));
                        expression.remove(i-1);
                    }
                    //otherwise set the element before the "-"  in the reversed array to the result of the operation and get rid of the "-"
                    //and the element after
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
            }// catch blocks above to catch common errors within the code. More specific error's dealt with in main class


        }
        Collections.reverse(expression);
        return expression;

    }
}