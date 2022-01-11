package day17_WhileAndDo_WhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCC";

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {
            //converting char to String ""
            String ch = ""+ str.charAt(i);// "A","A","B","B","C","C",
            if (result.contains(ch)){// if the result already contains the character
                continue;//skips
            }
          result +=ch;
        }
        System.out.println(result);
    }
}
