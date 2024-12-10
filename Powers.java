public class Powers {
    private double base;
    private int exponent;

    public void setBase(double base) {
        try {
            this.base = base;
        } catch (Exception e) {
            System.out.println("!Error! Could not set base. " + e.getMessage());
        }
    }

    public void setExponent(int exponent) {
        try {
            this.exponent = exponent;
        } catch (Exception e) {
            System.out.println("!Error! Could not set exponent. " + e.getMessage());
        }
    }

        public double calculatePower() {
            double result = 1;
            try {
                if (exponent < 0) {
                    throw new ArithmeticException("!Error! Exponent cannot be  a negative number. ");
                }
                for (int i = 0; i < exponent; i++) {
                    result *= base;
                }
                if (Double.isInfinite(result)) {
                    throw new ArithmeticException("!Error! The result of this calculation is too large. ");
                }
            } catch (ArithmeticException e) {
                System.out.println("!Math Error!" + e.getMessage());
                result = 0; //Prevents crash
            } catch (Exception e) {
                System.out.println("!Unknown Error!" + e.getMessage());
            }
            return result;
        }
    }

