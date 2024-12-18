import javax.management.RuntimeErrorException;
import java.util.ArrayList;

public class Parsing {
    public final String input;

    public Parsing(String input) {
        this.input = input;
    }

    public ArrayList<String> StringSplit() {
        //initialize array list that will store numbers and operators separately
        ArrayList<String> expressionSplit = new ArrayList<>();

        //for loop that looks at each character to see if it should be apart of a number or on its own e.g "*"
        for (int i = 0; i < input.length(); i++) {

            //case that white space exists within an input method just discards it
            while(input.charAt(i) == ' '){
                i++;
            }

            //create a string that will either be a number or an operator
            String numOrOp = String.valueOf(input.charAt(i));

            //while loop two characters in a row are numbers or a decimal if so increase the counter and add the next character to the number
            while ((i != (input.length() - 1)) && (isNumeric(String.valueOf(input.charAt(i))) || (input.charAt(i) == '.'))
                    && (isNumeric(String.valueOf(input.charAt(i + 1))) || (input.charAt(i + 1) == '.'))) {
                i++;
                numOrOp += String.valueOf(input.charAt(i));
            }
            //then add the final number or operator is added to the arraylist
            expressionSplit.add(numOrOp);


        }
        //case that minus is needed to be passed to the next number
        try{for (int i = 0; i < expressionSplit.size() - 1; i++) {
            //if the index is a minus
            if(expressionSplit.get(i).equals("-")) {
                //if the index is 0 then its passed to the next number
                if (i == 0 && Parsing.isNumeric(expressionSplit.get(1))) {
                    String negNum = expressionSplit.get(i);
                    negNum += expressionSplit.get(i + 1);
                    expressionSplit.set(i, negNum);
                    expressionSplit.remove(i + 1);
                }else if(i == 0){

                }
                else if ((!(Parsing.isNumeric(expressionSplit.get(i-1))))){

                    String negNum = expressionSplit.get(i);
                    negNum += expressionSplit.get(i + 1);
                    expressionSplit.set(i, negNum);
                    expressionSplit.remove(i + 1);

                }
            }
        }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Problem encountered.");

            throw e;
        }


        return expressionSplit;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
   // public abstract ArrayList<String> calculate(ArrayList<String> expression);
}
