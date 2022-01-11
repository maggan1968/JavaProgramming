package day23_CustomMethods_Void;

public class CustomMethod_With_Parameters {

    public static void main(String[] args) {

        //oddOrEven(); // the method demands additional info to complete this task

        oddOrEven(10);

        System.out.println("===========================================");

        ageOfPerson(1968);
    }



    //create a function that can check if a numbers is odd number or even number ==> oddOrEven
    public static void oddOrEven(int number){//10

        if (number%2==0){// even number
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }

    }


    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age= 2021 - birthYear;
        System.out.println("Your age is:"+age);

    }

}
