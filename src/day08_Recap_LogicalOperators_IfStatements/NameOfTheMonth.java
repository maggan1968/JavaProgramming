package day08_Recap_LogicalOperators_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {

        int number = 10;  // 1 ~ 12
        String name = "";

        if(number == 1){
            name = "Jan" ;
        }else if(number == 2){
            name = "Feb";
        }else if(number == 3){
            name = "Mar";
        }else if(number == 4){
            name = "Apr";
        }else if(number == 5){
            name = "May";
        }else if(number == 6){
            name = "Jun";
        }else if(number == 7){
            name = "Jul";
        }else if(number == 8){
            name = "Aug";
        }else if(number == 9){
            name = "Sep";
        }else if(number == 10){
            name = "Oct";
        }else if(number == 11){
            name = "Nov";
        }else {
            name = "Dec";
        }

        System.out.println("name = " + name);;




    }
}
/*
1. write a program that can display the name of the month

            number = 1 ~ 12
 */