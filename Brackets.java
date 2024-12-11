import java.util.ArrayList;
public class Brackets {

    public static void brackets(ArrayList<String> splitInput) {
        for (int i = splitInput.size() - 1; i >= 0; i--) {
            if (splitInput.get(i).equals("-")) {
                splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) - Double.parseDouble(splitInput.get(i - 1))));
                splitInput.remove(i + 1);
                splitInput.remove(i);
            }
        }
    }
}
//first/end bracket multiplication
//symbol+first bracket calculation


//make new class for bracket arraylist
//in brackets class - pass contents of bracket into arrayBracket class
//pass arrayBracket sum back into brackets
//if 5(4) multiply else if +( remove brackets