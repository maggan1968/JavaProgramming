package replits.variables;


import java.util.Scanner;

public class PhoneNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //int areaCode=scan.nextInt();
        int areaCode= 222;
        //int localNumber=scan.nextInt();
        int localNumber= 333444;

        String phoneNumber;
        System.out.println("Calling number " + "("+areaCode+")"+"-"+localNumber);

    }
}
/*
Write a program that asks user to input int values: areaCode and localNumber.

Using concatenation put together in this format and assign to String
phoneNumber variable:
(222)-3334444

Write a print statement that displays (use the phoneNumber variable ):
Calling number (222)-3334444
 */