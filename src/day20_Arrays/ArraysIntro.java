package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names


       //  create array of size 5
        String[] myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Margie";
        myGroup[2] = "Mickael";
        myGroup[3] = "Hulya";
        myGroup[4] = "Noel";


     //   System.out.println(myGroup); give you hashcode, its wrong
        System.out.println(Arrays.toString(myGroup));//["Gunay", "Margie","Mickael", "Hulya","Noel"]

        System.out.println("----------------------------------------------------------");

        // create array of week days-size 7
        //String[] days = new String[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday",};
                  //       0          1            2           3         4          5           6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1|| number> 7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("----------------------------------------------------------");

        // create array of months-size 12

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September","October", "November", "December"};
        System.out.println(Arrays.toString(months));

        int number2 = 7;

        if (number2 < 1 || number2 > 12){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(months[number2-1]);
    }
}
