package day3_Practice_Loops_String_Array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        String[] color = {"Yellow","Blue","Purple"};
        //                   0        1       2

        String[] color2 = new String[3];
        color2[0] = "Red";
        color2[1] = "Black";
        color2[2] = "Green";

        System.out.println(Arrays.toString(color2));
        System.out.println(color[1]);




        //equals
        int[] num=new int[4];   // 4 means is length

        num[0]=42;
        num[1]=35;
        num[2]=12;
        num[3]=9;
        System.out.println(Arrays.toString(num));

        int[] num1= {1,2,3,4};
        System.out.println("Arrays.equals(num,num1) = " + Arrays.equals(num, num1));

        //sort
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }
}
