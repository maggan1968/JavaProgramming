package day38_Inheritance.CarTask;

import day38_Inheritance.CarTask.Car;

public class Tesla extends Car {


    public static boolean isElectric = true;

    public Tesla(String brand, String model, int year, double price, String color, long miles) {
        super(brand, model, year, price, color, miles);


    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" is driving by itself");
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }
}

/*
 3. Tesla:
                extra methods:
                    autoPilot();
 */
