import java.util.ArrayList;

public class Calculations {
    public final String input;

    public Calculations(String input){
        this.input = input;
    }
    public String[] StringSplit(){
        String[] charToCalc = new String[input.length()];
        int j = 0;
        for(int i = 0; i < input.length(); i++){
            charToCalc[j] = String.valueOf(input.charAt(i));

            while((i != (input.length() - 1)) && (isNumeric(String.valueOf(input.charAt(i))) || (input.charAt(i) == '.') )
                    && (isNumeric(String.valueOf(input.charAt(i+1))) || (input.charAt(i+1)=='.'))){
                i++;
                charToCalc[j] += String.valueOf(input.charAt(i));
            }
            j++;


//hi
        }
        return charToCalc;


    }
    public ArrayList<String> StringSplit2(){
        ArrayList<String> charToCalc = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < input.length(); i++){
            charToCalc.add(j,String.valueOf(input.charAt(i)));

            while((i != (input.length() - 1)) && (isNumeric(String.valueOf(input.charAt(i))) || (input.charAt(i) == '.') )
                    && (isNumeric(String.valueOf(input.charAt(i+1))) || (input.charAt(i+1)=='.'))){
                i++;
                charToCalc.add(j,String.valueOf(input.charAt(i)));
            }
            j++;


//hi
        }
        return charToCalc;


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


//hi
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
