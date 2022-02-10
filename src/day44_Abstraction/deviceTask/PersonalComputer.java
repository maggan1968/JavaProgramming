package day44_Abstraction.deviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+ "is on");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+"is off");

    }
}
/*
Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop
 */