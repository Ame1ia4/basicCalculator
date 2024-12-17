import java.util.ArrayList;
public class Brackets extends Calculation {
    int openBracket;
    int closingBracket;
    public Brackets(ArrayList<String> expression ){
        super(expression);
        super.expression = expression;
    }

    public ArrayList<String> calculate() {
        if (expression.contains("(")) {
            this.openBracket = expression.lastIndexOf("(");
            boolean foundClosingBracket = false;
            for (int i = this.openBracket; i < expression.size() & !foundClosingBracket; i++) {
                if (expression.get(i).equals(")")) {
                    foundClosingBracket = true;
                    this.closingBracket = i;
                }
            }

            ArrayList<String> betweenBrackets = new ArrayList<>();
            for (int i = openBracket + 1; i < closingBracket; i++) {
                System.out.println(expression.get(i));
                betweenBrackets.add(expression.get(i));
            }

            expression.set(openBracket + 1, BIMDAS.recognition(betweenBrackets));
            for (int i = openBracket + 2; i < closingBracket; ) {
                expression.remove(openBracket + 2);
                closingBracket--;
            }
            if (openBracket == 0) {
                expression.remove(0);
            } else if (Parsing.isNumeric(expression.get(openBracket - 1))) {
                expression.set(openBracket, "*");

            } else {
                expression.remove(openBracket);
            }

            if (closingBracket == expression.size() - 1) {
                expression.remove(expression.size() - 1);
            } else if (Parsing.isNumeric(expression.get(closingBracket + 1))) {
                expression.set(closingBracket, "*");

            } else {
                expression.remove(closingBracket);
            }

        }
        return expression;
    }
}


