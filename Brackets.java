import java.util.ArrayList;
public class Brackets {
    ArrayList<String> expression;
    int openBracket;
    int closingBracket;

    public Brackets(ArrayList<String> expression, int openBracket, int closingBracket) {
        this.expression = expression;
        this.openBracket = openBracket;
        this.closingBracket = closingBracket;
    }


        public ArrayList<String> calculate() {
            System.out.println("hi");
            ArrayList<String> betweenBrackets = new ArrayList<>();
            for (int i = openBracket + 1; i < closingBracket; i++) {
                System.out.println(expression.get(i));
                betweenBrackets.add(expression.get(i));
            }

            expression.set(openBracket + 1, symbolRecognition.recognition(betweenBrackets));
            for (int i = openBracket + 2; i < closingBracket; ) {
                expression.remove(openBracket + 2);
                closingBracket--;
            }
            if (openBracket == 0) {
                expression.remove(0);
            } else if (Calculation.isNumeric(expression.get(openBracket - 1))) {
                expression.set(openBracket, "*");

            } else {
                expression.remove(openBracket);
            }

            if (closingBracket == expression.size() - 1) {
                expression.remove(expression.size() - 1);
            } else if (Calculation.isNumeric(expression.get(closingBracket + 1))) {
                expression.set(closingBracket, "*");

            } else {
                expression.remove(closingBracket);
            }

            return expression;
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
