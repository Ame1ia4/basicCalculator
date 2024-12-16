import java.util.ArrayList;
public class Brackets {
    ArrayList<String> exprestion;
    int openBracket;
    int closingBracket;
    public Brackets(ArrayList<String> exprestion, int openBracket, int closingBracket ){
        this.exprestion = exprestion;
        this.openBracket = openBracket;
        this.closingBracket = closingBracket;
    }
    public ArrayList<String> calculate(){
        //create array list that takes the expression between the brackets
        ArrayList<String> betweenBrackets = new ArrayList<>();
        for(int i = openBracket + 1; i < closingBracket; i++){
            System.out.println(exprestion.get(i));
            betweenBrackets.add(exprestion.get(i));
        }

        //set the value of 1 index after the opening bracket to the answer of the expression between the brackets
        exprestion.set(openBracket + 1, symbolRecognition.recognition(betweenBrackets));
        //remove the other indexes
        for (int i = openBracket + 2; i < closingBracket;){
            exprestion.remove(openBracket + 2);
            closingBracket--;
        }

        // if the opening bracket is the first in the array remove the bracket
        if(openBracket == 0){
            exprestion.removeFirst();
        }
        //else if before the bracket its a number the bracket becomes a multiply sign
        else if (Parsing.isNumeric(exprestion.get(openBracket - 1 ))) {
            exprestion.set(openBracket,"*");
        }
        //otherwise remove the opening bracket
        else {
            exprestion.remove(openBracket);
        }

        //if the closing bracket is the last value remove it
        if(closingBracket == exprestion.size()-1){
            exprestion.remove(exprestion.size()-1);

        //if the value after the closing bracket is a number make the closing bracket a multiply sign
        } else if (Parsing.isNumeric(exprestion.get(closingBracket + 1))) {
            exprestion.set(closingBracket,"*");
        }
        //otherwise remove the closing bracket
        else {
            exprestion.remove(closingBracket);
        }

        //return the Expression
        return exprestion;
    }

}
