package replits.string;

import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE:
        if (word1.length() == 3 && word2.length() == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print("" + word1.charAt(i) + word2.charAt(i));
            }
        } else {
            System.out.println("cannot merge");
        }

    }
}
/*
You have 2 words, both of them have 3 characters.

If either of them does not have exactly 3 characters, print "cannot merge"

Merge their characters one by one and print together like below:

Input:
aok
lol

Output:
alookl

Input:
ear
pie

 Output:
epaire

Input:
java
wow

Output:
cannot merge


hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.
 */