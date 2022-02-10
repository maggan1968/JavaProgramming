package day43_Abstraction_Intro.car;

public class Honda extends Car{


    public Honda(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price, color);
    }

    public void start(){
       System.out.println("Twist the key to ignition");
   }

    @Override
    public void drive() {

    }
}
/*
5. Create a subclass of Car named Toyota

	6. Create a sub class of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two sub class of Car named Audi &  Mercedes that implements AutoPark interface

	9. Create Two sub classes of Car named Tesla & Nio that implements AutoPark & AutoPilot interfaces

	10 Create a sub class of Car named CydeoCar that implements AutoPark, AutoPilot and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes

 */