import java.util.ArrayList;
import java.util.Collections;

public class symbolRecognition {


    public static String recognition(ArrayList<String> splitInput) {

        Division division = new Division();
        Multiplication multiplication = new Multiplication();
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();


        //gonna have to flip the array list bc this does it right to left as its starting with the last index
        boolean isBrackets = true;

        while (isBrackets) {
            int lastOpen = splitInput.lastIndexOf("(");
            int closeForLast = 0;
            for(int j = lastOpen; j < splitInput.size();j++){
                if(splitInput.get(j).equals(")")){
                    closeForLast = j;
                    j = splitInput.size();
                }
            }

        }
        Collections.reverse(splitInput);
            for(int i = splitInput.size() - 1; i >= 0; i--){
            if (splitInput.get(i).equals("*")) {
                multiplication.multiply(splitInput);
            } else if (splitInput.get(i).equals("/")) {
                division.divide(splitInput);
            }
        }
        for(int i = splitInput.size() - 1; i >= 0; i--){
            if (splitInput.get(i).equals("+")) {
                addition.add(splitInput);
            } else if (splitInput.get(i).equals("-")) {
                subtraction.subtract(splitInput);
            }

        }


        for (String currentChar : splitInput) {
            System.out.println(currentChar);
        }
        return splitInput.get(0);
    }
}
