package day49_Collection_Set_Queue;

import com.sun.deploy.util.JVMParameters;

import java.util.*;



public class Set_Interface_Practice {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();

        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list = " + list);

// set as reference
        Set<Integer> hashSet = new HashSet<>();// polymorphism be to happened must be Inheritance
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null));
        System.out.println("hashSet = " + hashSet);





        Set<Integer> linkedHashSet = new LinkedHashSet<>();


        Set<Integer> treeSEt = new TreeSet<>();
    }
}
