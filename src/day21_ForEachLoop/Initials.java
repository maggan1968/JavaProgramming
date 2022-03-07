package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {


        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for(String each : names ){
            String initial = each.charAt(0)+"."+ each.charAt(  each.indexOf(" ") +1   );
            System.out.println(initial);
        }

    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
