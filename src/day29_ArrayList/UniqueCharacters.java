package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

//convert the String to ArrayList
        String str = "aaabcccdeeef";

       // str.split("");// non primitive array
       // ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        String[]arr=str.split("");// non primitive array
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);
//then you can call frequency method from Collection Utility List
        String unique= "";

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if (frequency==1){
                unique+=each;
            }

        }
        System.out.println("unique = " + unique);

    }
}
