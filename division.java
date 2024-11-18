public class division {

    protected final int firstInput;
    protected final int secondInput;

    protected final float inputOne;
    protected final float inputTwo;


    public division(int firstInput, int secondInput, float inputOne, float inputTwo){

        int originInput = firstInput;

        for(int count=0; count<=secondInput; count++){
            firstInput= originInput- firstInput;
        }

        float inputOriginal = inputOne;

        for(int count=0; count<=inputTwo; count++){
            inputOne = inputOriginal - inputOne;
        }

        this.firstInput = firstInput;
        this.secondInput = secondInput;
        this.inputOne = inputOne;
        this.inputTwo = inputTwo;
    }

    public String toString(){
        return String.format("%d%f%n", firstInput, inputOne);
    }
}
