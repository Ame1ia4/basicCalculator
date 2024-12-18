import java.util.ArrayList;
public class Brackets extends Calculation {
    private int openBracket;
    private int closingBracket;
    public Brackets(ArrayList<String> expression ){
        super(expression);
    }

    @Override
    public ArrayList<String> calculate() {
        System.out.println(expression);
        if (expression.contains("(")){
            openBracket = expression.lastIndexOf("(");
            boolean foundClosingBracket = false;
            for (int i = openBracket; i < expression.size() && !foundClosingBracket; i++) {
                if (expression.get(i).equals(")")) {
                    foundClosingBracket = true;
                    closingBracket = i;
                }
            }

            ArrayList<String> betweenBrackets = new ArrayList<>();
            for (int i = openBracket + 1; i < closingBracket; i++) {
                betweenBrackets.add(expression.get(i));
            }

            expression.set(openBracket + 1, BIMDAS.orderOfOps(betweenBrackets));
            for (int i = openBracket + 2; i < closingBracket; ) {
                expression.remove(openBracket + 2);
                closingBracket--;
            }
            if (openBracket == 0) {
                expression.remove(0);
                closingBracket--;
            } else if (Parsing.isNumeric(expression.get(openBracket - 1))) {
                expression.set(openBracket, "*");

            } else {
                expression.remove(openBracket);
                closingBracket--;
            }

            if (closingBracket == expression.size() -1) {
                expression.remove(expression.size() - 1);
            } else if (Parsing.isNumeric(expression.get(closingBracket + 1))) {
                expression.set(closingBracket, "*");
            } else {
                expression.remove(closingBracket);
            }
            System.out.println(expression);
        }return expression;
    }
}



// brackets on own
// 5(12) but needs to multiply
// 5+(12-2) - throws error and gets rid of the 5 whyyyyyyyy
// parsing for example 123(123)-123