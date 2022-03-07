package day23_CustomMethods_Void;

import java.util.Arrays;

public class CustomMethodPractice_HomeWork {
    public static void main(String[] args) {

        oddNumbersWithSpace();

        System.out.println("========================================");

        evenNumbersWithSpace();

        System.out.println("========================================");

        eligibleToVote(32, false);

        System.out.println("=========================================");

        eligibleToBuyAlcohol(19);

        System.out.println("==========================================");

        studentGrade('A');

        System.out.println("===========================================");

        areaOfCircle(32.3);

        System.out.println("=============================================");

        areaOfSquare(45.7);

        System.out.println("=============================================");

        positiveNegativeOrZero(4);

        System.out.println("===============================================");

        eachChar('A');

        System.out.println("================================================");

       // eachElement(8);

        System.out.println("================================================");

        //calculator(2, 5, '+');


    }

    private static void eachChar(char a) {
    }


    //1. create a method that can print odd numbers between 1~100 in a same line separated by space
    private static void oddNumbersWithSpace() {

        for (int i = 1; i < 101; i += 2) {
            System.out.print(i + " ");
        }
    }

    //2. create a method that can print even numbers between 1~100 in a same line separated by space

    private static void evenNumbersWithSpace() {

        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    //3. create a method that can check if a person is eligible to buy alcohol

    public static void eligibleToBuyAlcohol(int age) {

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

    }

    //4. create a method that can check if a person is eligible to vote

    private static void eligibleToVote(int age, boolean isUSCitizen) {

        if (age >= 21 && isUSCitizen) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }

    //5. create a method that can calculate the grade of the student based on the score
    private static void studentGrade(char studentGrade) {


        switch (studentGrade) {

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
        }
    }

    //6. create a method that can calculate the area of a circle
    private static void areaOfCircle(double r) {

        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;
        System.out.println("area = " + area);
    }

    //7. create a method that can calculate the area of a square ==>areaOfSquare()
    private static void areaOfSquare(double side) {

        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("area = " + area);
    }

    //8. create a method that can convert dollar to euro
    //9. create a method that can can convert dollar to lira
    //10.create a method that can convert kg to lb

    //11.create a method that can if the given integer is positive, negative or zero
    private static void positiveNegativeOrZero(int positiveNegativeOrZero) {

        if (positiveNegativeOrZero > 0) {
            System.out.println("Positive");
        }
        if (positiveNegativeOrZero < 0) {
            System.out.println("Negative");
        }
        if (positiveNegativeOrZero == 0) {
            System.out.println("Zero");
        }
    }}

/*
        //12.create a method named printEachChar that can print each character of a string
        public static void eachChar (String eachChar){
            char[] letters = new char[26];//A,B,C,D......

            for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {//two variables in the same time
                letters[j] = i;
            }
            System.out.println(Arrays.toString(letters));//[A~Z]
        }

        //13.create a method named printEachElement that can print each element of an integer array
        public static void eachElement ( int eachElement){
            int[] numbers = {10, 9, 0, 1, 2, 30, 4, 6, 7, 8};
            System.out.println(Arrays.toString(numbers));
        }


        //14.create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
        public static void calculator ( int num1, int num2, char mathOperator){
            switch (mathOperator) {
                case '-':
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;

                case '+':
                    System.out.println("Addition: " + (num1 + num2));
                    break;

                case '*':
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;

                case '/':
                    System.out.println("Division: " + (num1 / num2));
                    break;

                case '%':
                    System.out.println("Remainder: " + (num1 % num2));
                    break;

                default:
                    System.out.println("Invalid Operator");
            }

        }
    }
}




    //15.write a method that can print out the full name of a person in regular format
//            ex:
//               fullName("cYdEo", "SCHOOL");
//
//                output:
//                    "Cydeo School"
//
//
//    17. create a method that can check if two strings are anagram
//    		ex:
//    			anagram("silent", "listen")
//
//
//			output:
//				silent and listen are anagram

*/










