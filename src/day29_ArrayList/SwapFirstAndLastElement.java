package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapFirstAndLastElement {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(67,56,4,33,22,55));
        System.out.println(list);

        Collections.swap(list, 0,list.size()-1);
        System.out.println(list);

    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList
of Integers
 */