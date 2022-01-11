package day17_WhileAndDo_WhileLoops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String  str = "JavaJavaJava";

        int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) {// i: 0,1,2,3
            String eachSub = str.substring(i, i + 4);
            //   System.out.println(eachSub);

            //how many times word Java aqur
            if (eachSub.equals("Java")) {
                frequency++;

            }
        }
            System.out.println(frequency);
        }

    }

/*
Write a program that the returns the frequency of the word Java from the sentence
Ex:
sentence = "JavaJavaJava";
output :3

approach:
Str = "JavaJava"
Substring to create string:
1. Java //substring(0,4)
2. avaJ //substring(1,5)
3. vaJa //substring(2,2+4)
4. aJav //substring(3,3+4)
5. Java //substring(4,4+4)

 */