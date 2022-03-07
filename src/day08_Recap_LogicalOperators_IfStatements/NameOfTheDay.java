package day08_Recap_LogicalOperators_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {

        int number = 5; //1 ~7

        if (number == 1) {
            System.out.println("Monday");
        }

        if (number == 2) {
            System.out.println("Tuesday");
        }

        if (number == 3) {
            System.out.println("Wednesday");
        }

        if (number == 4) {
            System.out.println("Thursday");
        }

        if (number == 5) {
            System.out.println("Friday");
        }

        if (number == 6) {
            System.out.println("Saturday");
        }

        if (number == 7) {
            System.out.println("Sunday");
        }

        System.out.println("==============================================");

        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else  {
            System.out.println("Sunday");
        }

        System.out.println("=========================================");

        String day;

        if(number == 1){
            day = "Monday";
        }else if(number == 2){
            day = "Tuesday";
        }else if(number == 3){
            day = "Wednesday";
        }else if( number == 4){
            day = "Thursday";
        }else if(number == 5){
            day = "Friday";
        }else if(number==6){
            day = "Saturday";
        } else{
            day = "Sunday";
        }

        System.out.println("day = " + day);

    }
}
/*
2. Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7
 */