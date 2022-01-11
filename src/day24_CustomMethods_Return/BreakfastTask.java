package day24_CustomMethods_Return;

public class BreakfastTask {
    public static void main(String[] args) {

        initials("Wooden", "spoon");

        System.out.println("====================================");

        domain("Cydeo@gmail.com");

        System.out.println("=====================================");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("========================================");

        nameOfMonth(4);

        System.out.println("==========================================");

        nameOfDay(5);

        System.out.println("======================================");

        daysInMonth(7);

        System.out.println("=========================================");

        ageGroups(53);

    }


    //1. Create a method that can display the initials of the person.==> initials(String firstName,String lastName)
    public static void initials(String firstName, String lastName) {

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2. Create a method that can display the domain of the email. ==> domain(String email)
    public static void domain(String email) {//Cydeo@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
//nested if use when we have pre-condition
        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
if(number<1 || number>7){

}
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

    }


    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number) {

        int number1 = 5;

        boolean has28Days = number1 == 2;// for the month that has 28 days

        //for the months that has 30 days
        boolean has30Days = number1 == 4 || number1 == 6 || number1 == 9 || number1 == 11;

        //for the months does not have 28 days and does not have 30 days
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days) { // if the month has 28 days
            System.out.println("28 days");
        }

        if (has30Days) { // if the month has 30 days
            System.out.println("30 days");
        }

        if (has31Days) { // if the month has 31 days
            System.out.println("31 days");
        }
    }

    //6. ageGroups(int age)
    public static void ageGroups(int age) {


        String result = "";

        if (age <= 2) {
            result = "Infant";
        } else if (age <= 5) {
            result = "Toddler";
        } else if (age <= 9) {
            result = "Kid";
        } else if (age <= 12) {
            result = "Pre-Teen";
        } else if (age <= 17) {
            result = "Teenager";
        } else if (age <= 20) {
            result = "Young Adult";
        } else if (age <= 39) {
            result = "Adult";
        } else if (age <= 49) {
            result = "Young Middle-Aged Adult";
        } else if (age <= 54) {
            result = "Middle-Aged Adult";
        } else if (age <= 64) {
            result = "Very Young Senior Citizen";
        } else if (age <= 74) {
            result = "Young Senior Citizen";
        } else if (age <= 84) {
            result = "Senior Citizen";
        } else {
            result = "Old Senior Citizen";
        }


        System.out.println(result);

    }
}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has

6. Create a class called AgeGroups, and write a program that can define the age groups of a person

                 age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

 */