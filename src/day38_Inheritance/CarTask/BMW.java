package day38_Inheritance.CarTask;

public class BMW extends Car{

    public static boolean isLuxuryBrand = true;

    public BMW(String brand, String model, int year, double price, String color, long miles) {
        super(brand, model, year, price, color, miles);

    }


    public void start() {
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }

    public  void breaksDown(){
        System.out.println("Call service");
    }

    public void racing(){
        System.out.println("Fast like eagle");
    }
    }

/*
 2. BMW:
                extra methods:
                    breaksDown()
                    racing()
 */