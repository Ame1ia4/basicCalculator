import java.util.ArrayList;

public abstract class Calculation {
    ArrayList<String> expression;

    Calculation(ArrayList<String> expression){
        this.expression = expression;
    }

    public abstract ArrayList<String> calculate();

    public String getFinal(){
        try{
            if(expression.size() != 1){
                throw new Exception("this isnt finished");
            }
            return expression.getFirst();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
        return "not finished";
    }
}
