package day44_Abstraction.deviceTask;

public  class  Computer extends Device{


    public Computer(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+ "is on");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+ "is off" );

    }
}

/*
Create a child abstract class of Device named Computer:

					Add any extra methods if needed

 */