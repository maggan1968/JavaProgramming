package day36_Inheritance.inheritance.phoneTask;

public class Samsung extends Phone {



    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void call(long phoneNumber){
        System.out.println(brand + " is calling" + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " is texting" + phoneNumber);
    }

    public void freeze(){
        System.out.println(brand + " is freezing");
    }


    }

/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */
