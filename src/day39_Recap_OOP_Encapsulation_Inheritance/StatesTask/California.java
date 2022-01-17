package day39_Recap_OOP_Encapsulation_Inheritance.StatesTask;

public class California extends States{


    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void siliconValley(){
        System.out.println("where the top tech hq meets!");


    }
}
