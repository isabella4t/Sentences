public class Sentence {
    int[] truth1 = new int[0];
    int[] truth2 = new int[0];
    char[] sent = new char[0];
    char p = 'p';
    char q = 'q';
    char op = '&';
    boolean pNEG = false;
    boolean qNEG = false;



    public Sentence(char p, boolean pneg, char q, boolean qneg, char op){
        if(pneg&&qneg){
            sent = new char[]{'~', p, op, '~', q};
        }
        if(pneg&&!qneg){
            sent = new char[]{'~', p, op, q};
        }
        if(!pneg&&qneg){
            sent = new char[]{ p, op, '~', q};
        }
        else sent = new char[]{p,op,q};
    }

    public String makeSentence(){
        if(pNEG&&qNEG){
            return "~"+ p+ op+ '~'+ q;

        }
        if(pNEG&&!qNEG){
           return "~"+ p+ op+ q;
        }
        if(!pNEG&&qNEG){
            return ""+ p + op+ '~'+ q;
        }
        else return ""+p+op+q;
    }

    public String truthtables(){

    }

}
