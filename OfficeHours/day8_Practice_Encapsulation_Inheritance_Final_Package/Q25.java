package day8_Practice_Encapsulation_Inheritance_Final_Package;

import java.util.ArrayList;
import java.util.Arrays;

public class Q25 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList
                ("during","storm","rain","fell","season","cloudy","safe"));
        ArrayList<Integer> lengths = new ArrayList<>();

        for(String word : words){
            //lengths.add(word.length);
        }

        System.out.println(lengths);

    }

}