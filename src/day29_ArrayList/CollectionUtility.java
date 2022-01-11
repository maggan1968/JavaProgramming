package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        //sort();
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);//{1,2,3,4,5,6,7,8,9,10}

        System.out.println("-------------------------------------");

// reverse();
        ArrayList<Character>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2); //{F,E,D,C,B,A)

        System.out.println("-----------------------------------------");

 //swap();
        ArrayList<Integer>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(20,30,40,50,60,70));
        System.out.println(list3);

        Collections.swap(list3, 4,1);
        System.out.println(list3);//{20,60,40,50,30,70}


        System.out.println("-----------------------------------------");
// max/ min

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("---------------------------------------------------");
//replaceAll
        ArrayList<Integer>list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,13,48,67,88));

        Collections.replaceAll(list4,10,1000);
        System.out.println(list4);

        System.out.println("---------------------------------------------------");

 //frequency();

       int frequency = Collections.frequency(list4,1000);

        System.out.println("frequency = " + frequency);

        System.out.println("---------------------------------------------------");
// check if frequency  of words Java are equal
        ArrayList<String>words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

         int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
