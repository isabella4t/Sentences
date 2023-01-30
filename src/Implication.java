public class Implication implements LogicalSentence{
    LogicalSentence arg1;
    LogicalSentence arg2;

    public Implication(LogicalSentence arg1_,LogicalSentence arg2_){
        arg1 = arg1_;
        arg2 = arg2_;
    }
/*
    public boolean unSatisfiable(){
        if(arg1.evaluate(e)&&!arg2.evaluate(e)){
            return false;
        }
        return true;
    }

 */
}
