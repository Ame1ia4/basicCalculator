import java.util.ArrayList;
public class Brackets {

    public static void brackets(ArrayList<String> splitInput) {

        //gonna have to flip the array list bc this does it right to left as its starting with the last index
        for(int i = splitInput.size() - 1; i >= 0; i--) {
            if (splitInput.get(i).equals("(")) {
                if (splitInput.get(i+2).equals("+")){
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) + Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i+2);
                }else if (splitInput.get(i+2).equals("-")){
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) - Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i + 2);
                }else if (splitInput.get(i+2).equals("*")){
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) * Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i + 2);
                }else if (splitInput.get(i+2).equals("/")){
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) / Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i + 2);
                }

                splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i - 1)) * Double.parseDouble(splitInput.get(i + 1))));
                splitInput.remove(i + 2);
                splitInput.remove(i + 1);
                splitInput.remove(i);
            }
        }

        for (String currentChar : splitInput) {
            System.out.println(currentChar);
        }
    }
}
