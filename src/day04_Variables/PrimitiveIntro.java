package day04_Variables;

public class PrimitiveIntro {

    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        //  byte weight = 160;  // 160 is out of byte' range
        //  byte num = -129; // -129 is out of byte' range
        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;


        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45367;
        System.out.println("ch3 = " + ch3);


         boolean isEmployeed = true;
         boolean isMarried = false;



    }
}
