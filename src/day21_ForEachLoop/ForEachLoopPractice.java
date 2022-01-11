package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        // print the first and last element of each character
        String[]words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
//                           Jg                   Cl              Wn             Es              As


        for (String each : words) {
            System.out.println(each.charAt(0) + "" + each.charAt(each.length()-1));
        }
    }
}
