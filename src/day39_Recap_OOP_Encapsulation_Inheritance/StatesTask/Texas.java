package day39_Recap_OOP_Encapsulation_Inheritance.StatesTask;

public class Texas extends States {
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void cowBoy(){
        System.out.println("Texas is a cowboys state!");
    }
}
