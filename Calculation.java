import java.util.ArrayList;

public abstract class Calculation {
    protected ArrayList<String> expression;//initialises instance variable

    Calculation(ArrayList<String> expression){
        this.expression = expression;
    }//constructor

    //abstract method calculate is created, which is overwritten by operations classes
    public abstract ArrayList<String> calculate();

    //getFinal method returns the first element in an index
    public String getFinal(){
//        try{
//            if(expression.size() != 1){
//                throw new Exception("this isn't finished");
//            }
//            return expression.get(0);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//
//        }
        return expression.getFirst();//gets the first element in the index

    }
    //method getExpression returns full expression array
    public ArrayList<String> getExpression(){
        return expression;
    }
}
