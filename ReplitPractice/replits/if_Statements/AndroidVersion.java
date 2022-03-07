package replits.if_Statements;

import java.util.Scanner;

public class AndroidVersion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        boolean Cupcake =version==1.5;
        boolean Donut= version== 1.6;
        boolean Eclair= version== 2.1;
        boolean Froyo= version== 2.2;
        boolean GingerBread= version== 2.3;
        boolean HoneyComb= version== 3.1;
        boolean IceCreamSandwich= version== 4.0;
        boolean JellyBean= version== 4.1;
        boolean KitKat= version== 4.4;
        boolean Lollipop= version== 5.0;
        boolean Oreo= version== 8.0;
        boolean Pie= version== 9.0;
        if (Cupcake){
            System.out.println("Cupcake");
        }
        if (Donut){
            System.out.println("Donut");
        }
        if (Eclair){
            System.out.println("Eclair");
        }
        if (Froyo){
            System.out.println("Froyo");
        }
        if (GingerBread){
            System.out.println("Gingerbread");
        }
        if (HoneyComb){
            System.out.println("Honeycomb");
        }
        if (IceCreamSandwich){
            System.out.println("Ice Cream Sandwich");
        }
        if (JellyBean){
            System.out.println("Jelly Bean");
        }
        if (KitKat){
            System.out.println("KitKat");
        }
        if (Lollipop){
            System.out.println("Lollipop");
        }
        if (Oreo){
            System.out.println("Oreo");
        }
        if (Pie){
            System.out.println("Pie");
        }
        if(!Cupcake&&!Donut&&!Eclair&&!Froyo&&!GingerBread&&!HoneyComb&&!IceCreamSandwich&&!JellyBean&&!KitKat&&!Lollipop&&!Oreo&&!Pie){
            System.out.println("Sorry, I don't know this version!");
        }


    }
}
/*
Android is one of the best operating systems in the world that helps the billion of users
 who use smart phones and tablets. Also, Android versions always had some funny names related
 to sweets. In this assignment, you need to write a program that will print a name of Android
 version, based on number. Please refer to the link beneath, in order to develop your if statement.
  https://www.javatpoint.com/android-versions

Create an object of Scanner class named scanner. (DONE)
Create double variable named version. (DONE)
Write an if statement that will print android version name based on value of the version variable.
Versions 1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1
 - Honeycomb 4.0 - Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0
  - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake

input: 9.0
output: Pie

input: 11.0
output: Sorry, I don't know this version!
 */