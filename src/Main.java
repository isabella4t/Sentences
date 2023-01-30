import sun.awt.im.SimpleInputMethodWindow;

import java.security.BasicPermission;
import java.util.ArrayList;

public class Main {

    /*
    p|q disjunctional or
    p&q conjuctional and
    p=> implication
    p<=>q biconditional

    order of operation logic
    NOT, AND, OR

RELATIONSHIPs
    equivalence = same thing
    consistency = both true
    entailment = i(a --> b)


  Properties
  - Valid
  - Unsatisfiable
  - Contingent


  Resolution
  Rule of inference
  a => b  (~a | b)
  b => c (~b | c)
  therefore a => c (~a | b)&(~b | c)

  We can use conjunction and disjunction to

What are sets

union : {a,b}U{b,c} = {a,b,c}
intersection : {a,b} N {b,c,} = {a}

The task:
make a truth column for q and p
see if entails each other

make another thing that asks if (p && !q) is unsatisfiable



     */

    public static void main(String[] args) {
        testTruthAssignment();

        ArrayList<String> pcs = new ArrayList<String>();
        pcs.add("p");
        pcs.add("q");

        System.out.println(pcs.size());

    }

    public static void testTruthAssignment(){

    }

    public static void doesitentail(){

    }

}
