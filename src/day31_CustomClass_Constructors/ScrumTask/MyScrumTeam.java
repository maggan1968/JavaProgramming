package day31_CustomClass_Constructors.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

//4 testers object
        Tester tester1 = new Tester("Yuliang", 11, "QA",  110000);
        Tester tester2 = new Tester("Abbos", 12, "SM",  115000);
        Tester tester3 = new Tester("Selda", 13, "QE",  120000);
        Tester tester4 = new Tester("Margie", 18, "QE",  120000);

        Tester[] testers = {tester2, tester3, tester4};

// 4 developers object
        Developer developer1 = new Developer("Zorana", 15, "Software Developer", 125000);
        Developer developer2 = new Developer("Mehmet", 16, "Java Developer",  130000);
        Developer developer3 = new Developer("Yuliia", 17, "Software Developer",  125005);
        Developer developer4 = new Developer("Yasin", 19, "Java Developer",  122000);

        Developer[] developers = {developer2, developer3, developer4};

//1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Shazia", "Fhilipp", "Aysu", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper( developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers( developers );

        System.out.println(scrum);

        System.out.println("------------------------------------------------------");

        for(Tester eachTester : scrum.testersList ){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }

        System.out.println("------------------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("------------------------------------------------------");

        scrum.removeTester(18);
        scrum.removeDeveloper(17);

        System.out.println(scrum);
    }


}

/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */


