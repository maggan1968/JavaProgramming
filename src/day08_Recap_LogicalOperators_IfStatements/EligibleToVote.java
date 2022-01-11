package day08_Recap_LogicalOperators_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >=21 && citizen == "USA";// true


        //Eligible
        if(isEligible){// true
            System.out.println("Eligible");
        }


        // not Eligible
        if(!isEligible){ // !true ==> not true ==> false
            System.out.println("Not Eligible");
        }
    }
}
