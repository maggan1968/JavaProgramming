package day39_Recap_OOP_Encapsulation_Inheritance.StatesTask;

public class Florida extends States{

    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void bestBeaches(){
        System.out.println("Best beaches state!");
    }

    public void humid(){
        System.out.println(getName()+" is humidity");
    }

    public void MexicanGulf(){
        System.out.println(getName()+" has Mexican Gulf city");
    }

}
