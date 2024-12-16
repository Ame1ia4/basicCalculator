import java.util.ArrayList;
public class Calculation {
    public final String input;



    public Calculation(String input){
        this.input = input;
    }
    public ArrayList<String> StringSplit3(){
        ArrayList<String> charToCalc = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            String numOrOp = String.valueOf(input.charAt(i));

            while((i != (input.length() - 1)) && (isNumeric(String.valueOf(input.charAt(i))) || (input.charAt(i) == '.') )
                    && (isNumeric(String.valueOf(input.charAt(i+1))) || (input.charAt(i+1)=='.'))){
                i++;
                numOrOp += String.valueOf(input.charAt(i));
            }
            charToCalc.add(numOrOp);
        }
        return charToCalc;
    }



    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }



}
