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
            //if the index element is a minus
            if(expressionSplit.get(i).equals("-")) {
                //if index element 0 is a minus and index 1 is numeric
                if (i == 0 && Parsing.isNumeric(expressionSplit.get(1))) {
                    String negNum = expressionSplit.get(i);//negNum is equal to value at index i
                    negNum += expressionSplit.get(i + 1); //negNum is added to i+1, and i+1 + negNum is set negNum
                    expressionSplit.set(i, negNum);//sets negNum to index position i
                    expressionSplit.remove(i + 1);//removes leftover indices elements
                }else if(i == 0){
                    //if i==0 and is a minus do nothing
                }
                else if ((!(Parsing.isNumeric(expressionSplit.get(i-1))))){//if i-1 is not numeric

                    String negNum = expressionSplit.get(i); //negNum is equal to value at index i
                    negNum += expressionSplit.get(i + 1); //negNum is added to i+1, and i+1 + negNum is set negNum
                    expressionSplit.set(i, negNum);//sets negNum to index position i
                    expressionSplit.remove(i + 1);//removes leftover indices elements

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
