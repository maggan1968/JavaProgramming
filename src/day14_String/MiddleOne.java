package day14_String;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

//    3 or more characters, print middle letter
        int middle= (word.length()/2);
        System.out.println("middle = " + middle);
//    Single character, print that character 3 times
        if(word.length()%2>0){

            if(word.length()>=3){
                System.out.println(word.charAt(middle));
            }else{
                System.out.println(word+word+word);
            }

        }else{

            if(word.length()%2==0){
// 4 or more characters, print the middle 2 characters
                if(word.length()>=4){
                    System.out.println(word.substring(middle-1,middle+1));
//2 characters, print those 2 characters twice
                }else{
                    System.out.println(word+word);
                }
            }
        }

    }
}
/*
You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     apples ==> pl
     #$%^&* ==> %^

2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */