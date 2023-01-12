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



     */

    public static void main(String[] args) {

        String input = "q";
        boolean checkq = isLogicalSimple(input);
        System.out.println(checkq);


    }

    public static boolean isLogicalSimple(String input){
        char[] inp = input.toCharArray();

        if(inp.length>1) return false;

        if ((inp[0]<='a')&&(inp[0]>='z')){
            //this is broken for some reason
            return true;
        }
      //  System.out.println(inp[0]);
        return false;
    }

    public static String SplitString(String input){
        char[] inp = input.toCharArray();
        //inp =
        return "1";
    }

    public static String WhatRelationship(int[] truth1, int[] truth2){
        return "e";
    }
}
