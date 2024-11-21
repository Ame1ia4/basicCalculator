public class multiplication {

    private double firstValue;
    private double secondValue;
    private double finalValue;

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue){
        this.secondValue = secondValue;
    }

    public double getFirstValue() {
            this.finalValue = firstValue*secondValue;
        return finalValue;
    }

    public String toString() {
        return String.format("f%n", finalValue);
    }
}

//pseudocode:
// step 1. get symbol * to symbolise multiplication
// basically when * is scanned this invokes the multiplication method
// Multiplication(mxn) is m adding to itself n number of times
//how to achieve this - possibly a for loop that has a count=no. of times adding(n) and adds another m each cycle.
//
//