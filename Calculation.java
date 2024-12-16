import java.util.ArrayList;

public abstract class Calculation {
    ArrayList<String> expression;

    Calculation(ArrayList<String> expression){
        this.expression = expression;
    }

    public abstract ArrayList<String> calculate();
}
