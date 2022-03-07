package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;



        //10%3 =1;

        //int division = 10/3; division remainder contains the result of num1 divided by num2
        int division = num1 / num2;
        //int remainder =10%3; // remainder variable contains the remainder of num1 divided by number
        int remainder =num1 % num2;

        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);
        System.out.println(num1 + " divided by " + 3 +" is equal to " + num2 + " with a remainder of 1"  );
        System.out.println(num1 +" divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder );
    }
}
/*
10 divided by 3 is equal to 3 with a remainder of 1
 */