import java.util.ArrayList;
public class symbolRecognition {


    public static void recognition(ArrayList<String> splitInput) {

        Division division = new Division();
        Multiplication multiplication = new Multiplication();
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Brackets brackets = new Brackets();

        //gonna have to flip the array list bc this does it right to left as its starting with the last index
            for(int i = splitInput.size() - 1; i >= 0; i--){
            if (splitInput.get(i).equals("+")) {
                splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i - 1)) + Double.parseDouble(splitInput.get(i + 1))));
                splitInput.remove(i + 1);
                splitInput.remove(i);
            } else if (splitInput.get(i).equals("-")) {
                splitInput.set(i-1, Double.toString(Double.parseDouble(splitInput.get(i - 1)) - Double.parseDouble(splitInput.get(i + 1))));
                splitInput.remove(i + 1);
                splitInput.remove(i);
            } else if (splitInput.get(i).equals("*")) {
                splitInput.set(i-1, Double.toString(Double.parseDouble(splitInput.get(i - 1)) * Double.parseDouble(splitInput.get(i + 1))));
                splitInput.remove(i + 1);
                splitInput.remove(i);
            } else if (splitInput.get(i).equals("/")) {
                splitInput.set(i-1, Double.toString(Double.parseDouble(splitInput.get(i - 1)) / Double.parseDouble(splitInput.get(i + 1))));
                splitInput.remove(i + 1);
                splitInput.remove(i);
            } else if (splitInput.get(i).equals("(")) {
                Brackets.brackets(splitInput);
            }
        }


        for (String currentChar : splitInput) {
            System.out.println(currentChar);
        }
    }
}

//Apply in main?
//Adapt maths classes so that (i-1) and (i+1) rather than first and second input