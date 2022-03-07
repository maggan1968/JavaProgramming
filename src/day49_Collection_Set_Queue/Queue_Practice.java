package day49_Collection_Set_Queue;

import java.util.*;

public class Queue_Practice {

    public static void main(String[] args) {

        Queue<Integer>priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);

        Queue<Integer>arrayQueue = new ArrayDeque<>();
        arrayQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayQueue = " + arrayQueue);

        Queue<Integer>linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("==============================================================");

        priorityQueue.poll();
        System.out.println("priorityQueue = " + priorityQueue);

        arrayQueue.poll();
        System.out.println("arrayQueue = " + arrayQueue);

        linkedList.poll();
        System.out.println("linkedList = " + linkedList);

        System.out.println("=================================================================");

        // System.out.println(priorityQueue.get(1));
        //  System.out.println(arrayDeque.get(1));

        //   System.out.println( ( (List)linkedList ).get(1) );

        System.out.println(((LinkedList<Integer>) linkedList).get(1));



    }

}
