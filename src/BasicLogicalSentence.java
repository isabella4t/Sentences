//aka basicLogicalSentence

public class BasicLogicalSentence implements LogicalSentence{
    private String p;

    BasicLogicalSentence(String p_){
        p = p_;
    }

    public boolean isValid() {
        return false;
    }

    public boolean unSatisfiable(){
        return false;
    }

    public String getP(){
        return p;
    }

    boolean evaluate(TruthAssignment ta){
        return ta.get(p);
    }

    //public contingent
}
