package day09_IfStatement;

public class EligibleForVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >=21 && citizen == "USA";// true



        //Eligible
        if(isEligible) {// true
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }


    }
    }

