package day11_Switch_Scanner;

public class NumbersOfDays {
    public static void main(String[] args) {


        int year = 2000;
        int number = 2;

        String result = "";

        if(number >= 1 && number <= 12){ // number: 1~12

            switch (number){
                case 2:
                    result = (year % 4 ==0)? "29 days" : "28 days";
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    result = "31 days";
            }

        }else{
            result = "Invalid Number";
        }


        System.out.println(result);

        System.out.println("=============================================");


        int year2 = 2000;
        int number2 = 2;

        if(number >= 1 && number <= 12) { // number: 1~12

            switch (number) {
                case 2:
                    if (year % 4 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    System.out.println("31 days");
            }
        }else {
            System.out.println(" invalid number");
        }

}
    }

/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */


