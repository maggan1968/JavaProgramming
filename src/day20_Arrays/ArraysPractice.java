package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        // store the elements: 10,20,50,70
        int[]numbers ={10,20,50,70};//size 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("=========================");

        //create a variable that can contain 5 scores
        int[]scores= new int[5];//[0,0,0,0,0]
        scores[1]=85;//[0,85,0,0,0]
        scores[scores.length-1]=95;//[0,85,0,0,95]
        scores[3]=75;//[0,85,0,75,95]
        scores[2]=45;//[0,85,45,75,95]
        scores[0]= 3;//[3,85,45,75,95]
        System.out.println(Arrays.toString(scores));//[3,85,45,75,95]


        System.out.println("-------------------------------------------------------");



        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September","October", "November", "December"};// 0~11(length -1)

        for (int i = 0; i < months.length; i++) {//i:represents the index numbers of array starting from 0
            System.out.println(months[i]);

        }
        System.out.println("-----------------------------------------------------------");

          //print months backwards

        for (int i = months.length-1; i >0 ; i--) {// i:represents the index numbers of array starting from last index
            System.out.println(months[i]);
        }


    }
}
