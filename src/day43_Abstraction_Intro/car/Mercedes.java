package day43_Abstraction_Intro.car;

public class Mercedes extends Car implements AutoPark{

    public Mercedes( double price, String color) {

        super("Mercedes", "C", 2021, price, color);
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
