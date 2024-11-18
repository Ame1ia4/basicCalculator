public class multiplication {

    protected int firstValue;
    protected final int secondValue;

    protected float valueOne;
    protected final float valueTwo;

public multiplication(int firstValue, int secondValue, float valueOne, float valueTwo){

   int originValue = firstValue;

for(int count=0; count<=secondValue; count++) {
    firstValue = originValue + firstValue;
}

float valueOriginal = valueOne;

for(int count=0; count<=valueTwo; count++) {
    valueOne = valueOriginal + valueOne;
}

this.firstValue = firstValue;
this.secondValue = secondValue;
this.valueOne = valueOne;
this.valueTwo = valueTwo;
    }
    public String toString(){
        return String.format("%d%f%n", firstValue, valueOne);
    }
}

//pseudocode:
// step 1. get symbol * to symbolise multiplication
// basically when * is scanned this invokes the multiplication method
// Multiplication(mxn) is m adding to itself n number of times
//how to achieve this - possibly a for loop that has a count=no. of times adding(n) and adds another m each cycle.
//
//