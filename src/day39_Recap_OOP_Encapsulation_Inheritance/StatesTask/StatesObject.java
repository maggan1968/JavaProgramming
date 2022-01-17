package day39_Recap_OOP_Encapsulation_Inheritance.StatesTask;

public class StatesObject {
    public static void main(String[] args) {

        Virginia virginia= new Virginia("Virginia", "VA", "Democratic Party", "Glenn Youngkin","Mark Warner", (int) 8.53,5.75);


        California california = new California("California","CA" ,"Democratic Party", "Gavin Newsom", "Alex Padilla", (int) 39.51,12.3);
        california.siliconValley();

        Florida florida= new Florida("Florida", "FL","Republican Party" , "Ron DeSantis","Marco Rubio", (int) 21.48,6);
        florida.humid();

        Texas texas = new Texas("Texas","TX" ,"Democratic Party", "Gavin Newsom","Alex Padilla" , 29,6.25);
        texas.cowBoy();

        System.out.println(florida);
        System.out.println(texas);
        System.out.println(virginia);
        System.out.println(california);
    }
}
/*

	3. Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes

 */