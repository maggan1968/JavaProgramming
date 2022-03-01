package day51_Map_Enum;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {


// implements the Map interface
// maintains the random order
// accepts null value as a key
//accepts one null key
//accepts multiple null value
// "Key" has to be unique
// fastest, uses more often
// when Key is duplicated the hasMap accepts the last pair
// value can be duplicated
//           Key     value
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10, "Artur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Margie");
        hashMap.put(null, "Ola");
        hashMap.put(null, "Albert");
        hashMap.put(1, null);
        hashMap.put(2, null);


        System.out.println("hashMap = " + hashMap);


//Child class of HashMap
//Maintains the insertion order
//Accepts null value as a key
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Artur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(5, "Margie");
        linkedHashMap.put(null, "Ola");
        linkedHashMap.put(null, "Albert");
        linkedHashMap.put(1, null);
        linkedHashMap.put(2, null);

        System.out.println("linkedHashMap = " + linkedHashMap);

// implements the SortedMap Interface
// maintains the sorted (Ascending) order
// does NOT accept null as a key
// does accept null as a value
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10, "Artur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Isabella");
        treeMap.put(5, "Margie");
        //treeMap.put(null, "Ola");
        //treeMap.put(null, "Albert");
        //treeMap.put(1, null);
        //treeMap.put(2, null);

        System.out.println("treeMap = " + treeMap);

// implements the Map interface
// maintains the random order
// accepts null value as a key
//accepts NOT null key
//accepts multiple null value
//Synchronized (Thread - Safe)
//is slow
        Map<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(10, "Artur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Isabella");
        hashtable.put(5, "Margie");
        //hashtable.put(null, "Ola");
       //hashtable.put(null, "Albert");
      // hashtable.put(1, null);
        //hashtable.put(2, null);

        System.out.println("hashtable = " + hashtable);
    }
}
