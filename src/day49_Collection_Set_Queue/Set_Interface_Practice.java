package day49_Collection_Set_Queue;

import com.sun.deploy.util.JVMParameters;

import java.util.*;



public class Set_Interface_Practice {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
//Implements the List interface,Internally uses array,Retrieving the element is faster
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list = " + list);

// set as reference
        Set<Integer> hashSet = new HashSet<>();

        //Implements the SortedSet interface,maintains the random order, accepts null value
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("hashSet = " + hashSet);
       // System.out.println(hashSet.get(4));




        Set<Integer> linkedHashSet = new LinkedHashSet<>();

//Child class of HashSet,Maintains the insertion order,Accepts null values
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("linkedHashSet = " + linkedHashSet);



        Set<Integer> treeSet = new TreeSet<>();

        //Implements the SortedSet interface, NOT accept nuul and is in sorted order
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));

        //treeSet.addAll(Arrays.asList(null,null,null));

        System.out.println("treeSet = " + treeSet);

    }
}
