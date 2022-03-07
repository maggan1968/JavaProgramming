package day28_ArrayList;

import java.util.ArrayList;

public class Set_Last_Element {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        number.set(number.size() - 1, 0);
        System.out.println(number);


    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */