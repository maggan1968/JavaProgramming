package day18_Nested_Loop;

public class DivideTwoNumbers_INTERVIEW {
    public static void main(String[] args) {

        int a = 30; // a=30-7=23-7=16-7=9 after 3 execution -7=2 after four execution
        int b = 7;

        int count = 0;// count = 1+1=2+1=3 after 3 execution +1=4

        while (a >= b){
            a -=b;
            count++;
        }
        System.out.println(count+"with a remainder of "+a);
    }
}
/*
1. Write a program that can divide two positive numbers without
 using / (division) and * (multiplication) operators.

20 / 6 ==> 3 with reminder of 2

  a = 20
                        b = 6;
                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2
                        x = 100;
                        y = 8;
                        while(a >= b){
                                a -= b;
                                count++;
                        }
 */