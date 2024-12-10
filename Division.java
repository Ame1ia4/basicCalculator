import java.util.ArrayList;

public class Division extends Addition {

    public static void divide(ArrayList<String> splitInput) {
        try { //Put logic in try block so error handling can be done at end with catch blocks
            for (int i = splitInput.size() - 1; i >= 0; i--) {
                if (splitInput.get(i).equals("/")) {
                    // Div by zero error handler
                    if (Double.parseDouble(splitInput.get(i + 1)) == 0) {
                        throw new ArithmeticException("Divisor cannot equal to zero. Please try again!");
                    }

                    splitInput.set(i - 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) / Double.parseDouble(splitInput.get(i - 1))));
                    splitInput.remove(i + 1);
                    splitInput.remove(i);
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("!Math Error!"+e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("!Format Error!" + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("!Index Error!" + e.getMessage());
        }
    }
}

