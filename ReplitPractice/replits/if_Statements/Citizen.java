package replits.if_Statements;

import java.util.Scanner;

public class Citizen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");

        int seniorCitizens = input.nextInt();
        int nonseniorCitizens = input.nextInt();

        System.out.println("What is new citizen's age?");

        int age = input.nextInt();
        int result1 = 0;
        int result2 = 0;
        if (age>=65){
            System.out.println ("Senior Citizen");
            result1 = ++seniorCitizens;
        }else {
            System.out.println ("Non-Senior Citizen");
            result2= ++nonseniorCitizens;
        }
        System.out.println("New seniorCitizens count " + seniorCitizens);

        System.out.println("New nonSeniorCitizens count " + nonseniorCitizens);

        input.close();



    }
}
/*
1. Declare int variables: seniorCitizens, nonSeniorCitizens, age
2. Create a Scanner object
3. Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:

"Enter current count for seniorCitizens and nonSeniorCitizens:"

4. Ask user to enter age:

"What is new citizen's age?"

- if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment
 seniorCitizens variable by 1.

- if citizen's age is less than 65 then print "Non-Senior Citizen" and increment
nonSeniorCitizens variable by 1.

5. Last print another message:

"New seniorCitizens count ValueOfVariable"

"New nonSeniorCitizens count ValueOfVariable"

Example:

Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
 */