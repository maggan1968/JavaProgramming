package day44_Abstraction.deviceTask;

public abstract class Google extends Phone implements AndroidApps{
    public Google(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void unlock() {
        System.out.println("Alexa say: to unlock");

    }
}
/*
Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone :
						extends Phone class and implements Downloadable & AppleApps interfaces

				2. Samsung:
						extends Phone class and implements Downloadable & AndroidApps interfaces

				4. Google:
						extends Phone class and implements Downloadable & AndroidApps interfaces
 */