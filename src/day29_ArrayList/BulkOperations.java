package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        //addAll(CollectionType); adds collection to new array
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10));

        System.out.println(list);

        // removeAll(CollectionType)removes all matching elements
        list.removeAll(Arrays.asList(3, 5, 8));

        System.out.println(list);


        System.out.println("---------------------------------------------------");

//retainAll(CollectionType)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));

        numbers.retainAll(Arrays.asList(100, 200, 300));

// all numbers who not matching to the value of 100,200,300 will be removed
        System.out.println(numbers);

        System.out.println("----------------------------------------------");


        //retainAll(CollectionType)
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "Scrum Master", "QA", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "BA"));

        System.out.println(jobTitles);

        System.out.println("----------------------------------------------------");

        //containsAll(CollectionType) checks if all the elements are contained in teh arraylist
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------------------------------------");


        String[] names = {"Josh", "Jack", "Daniel","Shay", "Margie"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));

         */

        System.out.println(namesList);

        System.out.println("------------------------------------------------");

       int[]arr2= {1,2,3,4,5,6,7,8,9,10};//primitive type, its not allowed converting
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);

        //primitive type, its not allowed converting
       // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        Integer[]arr= {1,2,3,4,5,6,7,8,9,10};//primitive type int , its not allowed converting has to be non-primitive Integer

        //primitive type, its not allowed converting
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);
    }

    public static ArrayList<Integer> convertArrayToArrayList(int[]array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);


        }
        return list;
    }
}
