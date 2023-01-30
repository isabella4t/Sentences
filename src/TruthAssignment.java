import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Math;

public class TruthAssignment {

    HashMap<String,Boolean> theREP;

    public TruthAssignment(BasicLogicalSentence[] sents){
        for(int i = 0; i<sents.length;i++){
            theREP.put(sents[i].getP(),sents[i].isValid());
        }
    }

    public TruthAssignment(ArrayList<String> pcs, ArrayList<Boolean> bools){
        for(int i = 0; i<pcs.size();i++){
            theREP.put(pcs.get(i),bools.get(i));
        }
    }


    public void put(String lo, boolean v){
        theREP.put(lo,v);
    }

    //delegation
    public boolean get(String lo){
        return theREP.get(lo);
    }

    public void Arraylisting(){
        ArrayList<String> pcs = new ArrayList<String>();
        pcs.add("p");
        pcs.add("q");

        ArrayList<Boolean> booleans = new ArrayList<Boolean>();
        booleans.add(false);
        booleans.add(false);

        TruthAssignment ta = new TruthAssignment(pcs,booleans);

        for(int k = 0; k<Math.pow(2,pcs.size());k++){

            for(int i = 0; i< extract(2,k); i++){
                boolean f = false;
                if(i==1) f = true;
                ta.put(pcs.get(k),f);

            }
        }

    }

    public int extract(int p, int k){
        return (1<<p)&k;
    }



    // (a | ~b | c) & (~a | b | c)
}
