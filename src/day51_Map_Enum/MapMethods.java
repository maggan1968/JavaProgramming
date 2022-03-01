package day51_Map_Enum;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score

        Map<String, Integer> students = new HashMap<>();
//if I want incrize the size I use put()
        students.put("Margie",85);
        students.put("Maria", 86);
        students.put("Ali", 96);
        students.put("Olga",49);
        students.put("Serkan", 86);
        students.put("Ozan", 96);

        students.put("Ali", 87);
        students.put("Ali", 88);



        System.out.println(students);
        System.out.println(students.size());//6



        //display the score of Serkan
        System.out.println(students.get("Serkan"));//86


        //replace Ali's score to 90 (the value)
        students.replace("Ali", 90);
        System.out.println(students);

        //remove Olga
        students.remove("Olga");
        System.out.println(students);

       //containsKey()
        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);

        //containsValue()
        boolean r3 = students.containsValue(97);
        System.out.println(r3);

        //isEmpty()
        System.out.println(students.isEmpty());

        System.out.println("===============================================");
        // equals()
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map1.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);
        System.out.println(map1==map2);
        System.out.println(map1.equals(map2));

        //clear()
        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);






    }
}
