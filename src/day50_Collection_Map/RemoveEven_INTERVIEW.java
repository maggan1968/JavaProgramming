package day50_Collection_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven_INTERVIEW {
    public static void main(String[] args) {

        Set<Integer>set = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,100,90,80,75,45,35,25,15));

       // set.removeIf(p->p %2==0); //lambda expression

       Iterator<Integer> it = set.iterator();//this way we do without lambda method
       while (it.hasNext()){
           if (it.next()%2==0){
               it.remove();
           }
       }
        System.out.println(set);
    }
}
