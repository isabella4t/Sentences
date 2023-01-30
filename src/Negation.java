public class Negation implements LogicalSentence{
    private LogicalSentence arg;

    public Negation(LogicalSentence arg2){
        arg = arg2;
    }

    public boolean isValid(){
        return arg.unSatisfiable();
    }

    public boolean unSatisfiable(){
        return arg.isValid();
    }
/*
    public boolean evaluate(TruthAssignment ta){
        return !arg.evaluate(ta);
    }

 */

}
