package day43_Abstraction_Intro.car;

public class Tesla extends Car implements AutoPilot{
    public Tesla( double price, String color) {
        super("Tesla", "S", 2020, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println(getBrand()+" "+getModel()+" is self driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getBrand()+" "+getModel()+" is auto parking");
    }

    @Override
    public void start() {
        System.out.println(getBrand()+" "+getModel()+" press button start");
    }

    @Override
    public void drive() {
        System.out.println(getBrand()+" "+getModel()+" is driving");
    }


}
