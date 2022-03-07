package day28_ArrayList;

import java.util.ArrayList;

public class Swap_First_Element {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        number.add(number.get(0));
        number.set(0, number.get(number.size()-2));
        number.remove(number.size()-2);
        System.out.println(number);
    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
                ex:
                    list = [1,2,3,4,5];
                    output: [5,2,3,4,1];

 */


