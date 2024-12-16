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
        System.out.println("hi");
        ArrayList<String> betweenBrackets = new ArrayList<>();
        for(int i = openBracket + 1; i < closingBracket; i++){
            System.out.println(exprestion.get(i));
            betweenBrackets.add(exprestion.get(i));
        }

        exprestion.set(openBracket + 1, symbolRecognition.recognition(betweenBrackets));
        for (int i = openBracket + 2; i < closingBracket;){
            exprestion.remove(openBracket + 2);
            closingBracket--;
        }
        if(openBracket == 0){
            exprestion.remove(0);
        } else if (Calculation.isNumeric(exprestion.get(openBracket - 1 ))) {
            exprestion.set(openBracket,"*");

        }
        else {
            exprestion.remove(openBracket);
        }

        if(closingBracket == exprestion.size()-1){
            exprestion.remove(exprestion.size()-1);
        } else if (Calculation.isNumeric(exprestion.get(closingBracket + 1))) {
            exprestion.set(closingBracket,"*");

        }
        else {
            exprestion.remove(closingBracket);
        }

        return exprestion;
    }

}



    //need symbol before bracket recognition - COMPLETE
    //need bracket first recognition
    //ex: if splitInput[0]="("
    //or if (splitInput[0]=splitInput.get(i))
    //{
    // splitInput.set(i, Double.toString(Double.parseDouble(splitInput.get(i + 1)) + Double.parseDouble(splitInput.get(i + 3))));
    //                       splitInput.remove(i + 3);
    //                       splitInput.remove(i + 2);
    //}}
    //splitInput.set(i + 1, Double.toString(Double.parseDouble(splitInput.get(i + 1)) / Double.parseDouble(splitInput.get(i + 3))));
    //                    splitInput.remove(i + 3);
    //                    splitInput.remove(i + 2);


//for loop j
