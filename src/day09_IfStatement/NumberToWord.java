package day09_IfStatement;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 1;

        if(number == 0){
            System.out.println("zero");
        }else if(number == 1){
            System.out.println("one");
        }else if(number == 2){
            System.out.println("two");
        }else if(number == 3){
            System.out.println("three");
        }else if(number == 4){
            System.out.println("four");
        }else if(number == 5){
            System.out.println("five");
        }else if(number == 6){
            System.out.println("six");
        }else if(number == 7){
            System.out.println("seven");
        }else if(number == 8) {
            System.out.println("eight");
        }else {
            System.out.println("nine");
        }
    }
}



/*
Create a class called NumberToWord, and write a java program that can
 convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */


