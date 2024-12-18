import java.util.ArrayList;

public abstract class Calculation {
    protected ArrayList<String> expression;

    Calculation(ArrayList<String> expression){
        this.expression = expression;
    }

    public abstract ArrayList<String> calculate();

    public String getFinal(){
//        try{
//            if(expression.size() != 1){
//                throw new Exception("this isnt finished");
//            }
//            return expression.get(0);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//
//        }
        return expression.getFirst();

    }
    public ArrayList<String> getExpression(){
        return expression;
    }
}
