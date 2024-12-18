import java.util.ArrayList;
public class Brackets extends Calculation {
    //instant variables for opening and closing brackets that tracks there indexes
    private int openBracket;
    private int closingBracket;

    //constructor that sets the expression within the superclass
    public Brackets(ArrayList<String> expression ){
        super(expression);
    }

    //overriding the abstract method calculate
    @Override
    public ArrayList<String> calculate() {
        //only does operations if the expression has an element that is an open bracket
        if (expression.contains("(")){
            openBracket = expression.lastIndexOf("(");//sets the opening bracket to the last opening bracket element

            boolean foundClosingBracket = false;// used to exit for loop once a closing bracket is found
            //for loop to find the closing bracket after the last opening bracket
            for (int i = openBracket; i < expression.size() && !foundClosingBracket; i++) {
                if (expression.get(i).equals(")")) {
                    foundClosingBracket = true;
                    closingBracket = i;
                }
            }

            ArrayList<String> betweenBrackets = new ArrayList<>();//arrayList used to store what is between the brackets
            //for loop that adds the elements between the brackets to the array list
            for (int i = openBracket + 1; i < closingBracket; i++) {
                betweenBrackets.add(expression.get(i));
            }

            expression.set(openBracket + 1, BIMDAS.orderOfOps(betweenBrackets));//sets the element after the opening bracket to the result of what is between the brackets
            //for loop used to remove everything after the resulting element
            for (int i = openBracket + 2; i < closingBracket; ) {
                expression.remove(openBracket + 2);
                closingBracket--;//moves back the pointer of the closing bracket when an element is removed
            }
            //case that opening bracket is first element it is removed and pointer to closingBracket is decremented
            if (openBracket == 0) {
                expression.remove(0);
                closingBracket--;
            }
            //case that element before opening bracket is a number it will change the bracket to "*"
            else if (Parsing.isNumeric(expression.get(openBracket - 1))) {
                expression.set(openBracket, "*");
            //otherwise the bracket is removed and closing bracket is decremented
            } else {
                expression.remove(openBracket);
                closingBracket--;
            }
            // case that closing bracket is last element just removes the bracket
            if (closingBracket == expression.size() -1) {
                expression.remove(expression.size() - 1);
            }
            //case that the element after the closing bracket is a number it sets the bracket to "*"
            else if (Parsing.isNumeric(expression.get(closingBracket + 1))) {
                expression.set(closingBracket, "*");
            }
            //otherwise the bracket is removed
            else {
                expression.remove(closingBracket);
            }
        }
        return expression;//return the expression if there were brackets one set will have been removed
    }
}


