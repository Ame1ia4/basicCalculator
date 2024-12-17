import java.util.ArrayList;
public class Subtraction {

    public static void subtract(ArrayList<String> splitInput) {
        try {
        for (int i = splitInput.size() - 1; i >= 0; i--) {

            if (!(Parsing.isNumeric(splitInput.get(i)))) {
                String NegNum = splitInput.get(i);
                NegNum += splitInput.get(i + 1);
                splitInput.set(i, NegNum);
            }

            if (splitInput.get(i).equals("-")) {
                splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) - Double.parseDouble(splitInput.get(i - 1))));
                splitInput.remove(i + 1);
                splitInput.remove(i);
            }
        }
    } catch (NumberFormatException e) {
            System.out.println("!Error! Values entered must be numeric! Please try again." );
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!Error! Invalid Index.. Check Input structure and try again." );
        } catch (Exception e) {
            System.out.println("!Unknown Error!:" + e.getMessage());
        }
    }
}

