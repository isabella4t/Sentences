public class Conjunction implements LogicalSentence{
    LogicalSentence arg1;
    LogicalSentence arg2;

    public Conjunction(LogicalSentence arg1_,LogicalSentence arg2_){
        arg1 = arg1_;
        arg2 = arg2_;
    }

    public boolean isValid(){
        return (arg1.isValid() && arg2.isValid());
    }

    public boolean unSatisfiable(){
        // allmypcs --> union (arg1.allmypcs, arg2.allmypcs);
      //  for(TruthAssignment e : allmytruth(allmypcs));
    }

    public boolean evaluate(TruthAssignment ta){
        return arg1.evaluate(ta)&&arg2.evaluate(ta);
    }
}
