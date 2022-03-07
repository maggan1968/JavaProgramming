package day38_Inheritance.carTask;

public class Tesla extends Car {


    public static boolean isElectric = true;

    public Tesla(String model, int year, double price, String color, long miles) {
        super("Tesla", model, year, price, color, miles);


    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }


    @Override
    public void start() {
        System.out.println("Say\"Start\" to start " + brand+" "+model);
    }
}

/*
 3. Tesla:
                extra methods:
                    autoPilot();
 */