package day44_Abstraction.deviceTask;

public abstract class Device {

    private final String brand,model;



    private double price;
    private String color;
    private final String size;

    static boolean hasBAttery, hasPowerButton;

    static{
        hasBAttery=true;
        hasPowerButton=true;
    }

    public Device(String brand, String model, double price, String color, String size) {
        if(brand.isEmpty()){
            throw new RuntimeException("Error - brand is empty");
        }

        this.brand = brand;
        if(model.isEmpty()){
            throw new RuntimeException("Error - brand is empty");
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if(size.isEmpty()){
            throw new RuntimeException("Error - brand is empty");
        }
        this.size = size;
    }

    //Getters
    public String getBrand() {

        return brand;
    }
    public String getModel() {

        return model;
    }
    public double getPrice() {

        return price;
    }
    public String getColor() {

        return color;
    }
    public String getSize() {

        return size;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            throw new RuntimeException("Error - brand is empty");
        }
        this.color = color;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException(" invalid price :"+price);
        }
        this.price = price;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price ="+price + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

/*
Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */