public class Powers {
    private double base;
    private int exponent;

    public void setBase(double base) {
        this.base = base;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public double calculatePower() {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
