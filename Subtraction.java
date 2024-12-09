import java.util.ArrayList;
public class Subtraction {

    public static void subtract(ArrayList<String> splitInput) {
        for (int i = splitInput.size() - 1; i >= 0; i--) {
            if (splitInput.get(i).equals("-")) {
                splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) - Double.parseDouble(splitInput.get(i - 1))));
                splitInput.remove(i + 1);
                splitInput.remove(i);
            }
        }
    }
}
