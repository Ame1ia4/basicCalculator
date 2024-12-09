import java.util.ArrayList;
public class Brackets {

    public static void brackets(ArrayList<String> splitInput) {

        for (int i = splitInput.size() - 1; i >= 0; i--) {
            if (splitInput.get(i).equals("(")) {
                if (splitInput.get(i + 2).equals("+")) {
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) + Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i + 2);
                } else if (splitInput.get(i + 2).equals("-")) {
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) - Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i + 2);
                } else if (splitInput.get(i + 2).equals("*")) {
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) * Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i + 2);
                } else if (splitInput.get(i + 2).equals("/")) {
                    splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) / Double.parseDouble(splitInput.get(i + 3))));
                    splitInput.remove(i + 3);
                    splitInput.remove(i + 2);
                }


                if (splitInput.get(i - 1).equals("+")) {
                    splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i - 2)) + Double.parseDouble(splitInput.get(i + 1))));
                    splitInput.remove(i + 2);
                    splitInput.remove(i + 1);
                    splitInput.remove(i);
                } else if (splitInput.get(i - 1).equals("-")) {
                    splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i - 2)) - Double.parseDouble(splitInput.get(i + 1))));
                    splitInput.remove(i + 2);
                    splitInput.remove(i + 1);
                    splitInput.remove(i);
                } else if (splitInput.get(i - 1).equals("*")) {
                    splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i - 2)) * Double.parseDouble(splitInput.get(i + 1))));
                    splitInput.remove(i + 2);
                    splitInput.remove(i + 1);
                    splitInput.remove(i);
                } else if (splitInput.get(i - 1).equals("/")) {
                    splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i - 2)) / Double.parseDouble(splitInput.get(i + 1))));
                    splitInput.remove(i + 2);
                    splitInput.remove(i + 1);
                    splitInput.remove(i);
                } else {
                    splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i - 1)) * Double.parseDouble(splitInput.get(i + 1))));
                    splitInput.remove(i + 2);
                    splitInput.remove(i + 1);
                    splitInput.remove(i);
                }

            }
        }
    }
}



    //need symbol before bracket recognition - COMPLETE
    //need bracket first recognition
    //ex: if splitInput[0]="("
    //or if (splitInput[0]=splitInput.get(i))
    //{
    // splitInput.set(i, Double.toString(Double.parseDouble(splitInput.get(i + 1)) + Double.parseDouble(splitInput.get(i + 3))));
    //                       splitInput.remove(i + 3);
    //                       splitInput.remove(i + 2);
    //}}
    //splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) / Double.parseDouble(splitInput.get(i + 3))));
    //                    splitInput.remove(i + 3);
    //                    splitInput.remove(i + 2);


//for loop j
