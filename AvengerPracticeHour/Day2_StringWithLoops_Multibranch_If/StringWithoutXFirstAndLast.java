package Day2_StringWithLoops_Multibranch_If;

public class StringWithoutXFirstAndLast {
    public static void main(String[] args) {

        String word ="xHellox";

        String temp = "";
                //input:"xHix:==>Hi
        if (word.charAt(0) == 'x' && word.charAt(word.length() - 1) == 'x') {
            temp = word.substring(1, word.length() - 1);
        }
        else if(word.charAt(0) == 'x'){
            temp = word.substring(1);
        }else if(word.charAt(word.length() - 1) == 'x'){
            temp = word.substring(0,word.length()-1);
        }else {
            temp = word;
        }
        System.out.println(temp);
    }
}
