import java.util.ArrayList;

public class Powers {

    public static void calculatePowers(ArrayList<String> splitInput) {

        for (int i = splitInput.size() - 1; i >= 0; i--) {
            try {

                if (splitInput.get(i).equals("^")) {

                    double base = Double.parseDouble(splitInput.get(i - 1));
                    int exponent = Integer.parseInt(splitInput.get(i + 1));




                    double result = 1;
                    if (exponent < 0) {
                        throw new ArithmeticException("Exponent cannot be negative.");
                    }
                    for (int j = 0; j < exponent; j++) {
                        result *= base;
                    }

                    if (Double.isInfinite(result)) {
                        throw new ArithmeticException("The result is too large.");
                    }


                    splitInput.set(i - 1, Double.toString(result));
                    splitInput.remove(i + 1);
                    splitInput.remove(i);
                }
            } catch (NumberFormatException e) {
                System.out.println("!Error! Values entered must be numeric! Please try again.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("!Error! Invalid Index. Check input structure and try again.");
            } catch (ArithmeticException e) {
                System.out.println("!Math Error! " + e.getMessage());
            } catch (Exception e) {
                System.out.println("!Unknown Error! " + e.getMessage());
            }
        }
    }
}
