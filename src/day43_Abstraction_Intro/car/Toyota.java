package day43_Abstraction_Intro.car;

public class Toyota extends Car{


    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getBrand()+getModel()+"press button start");

    }

    @Override
    public void drive() {
        System.out.println(getBrand()+getModel()+"is driving");

    }
}
