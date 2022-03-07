package day44_Abstraction.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    public void call(long phoneNum){
        System.out.println(getBrand()+ "is calling ("+phoneNum+")");
    }

    public void text(long phoneNum){
        System.out.println(getBrand()+ "is calling ("+phoneNum+")");
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+ "phone on");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+ "phone off");

    }
public abstract void unlock();

    @Override
    public String toString() {
        return super.toString();
    }
}

/*
Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */