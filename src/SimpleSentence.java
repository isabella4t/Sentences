public class SimpleSentence {
    boolean status = true;
    boolean negated = false;

    public SimpleSentence(boolean val){
        status = val;
    }

    public void isNegated(boolean neg){
        negated = neg;
    }
}
