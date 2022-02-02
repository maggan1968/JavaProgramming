package day42_Exceptions_ThrowsKeyword.inheritance.phoneTask;

public class IPhone extends Phone{


    public IPhone(String model, String size, double price, String color) {
        super("Apple", model, size, (int) price, color);
    }

    public void IPhone(String model, String size, String color, double price) {

    }

    public void call(long phoneNumber){
        System.out.println("Apple' iphone is calling "+phoneNumber);
    }

    public void call(long phone1, long phone2){
        call(phone1);
        call(phone2);
    }

    public void call(long phone1, long phone2, long phone3) {
        call(phone1, phone2);
        call(phone3);
    }

    public void text(long phoneNumber){
        System.out.println("Apple' iphone is texting "+phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println("Apple' iphone is having a faceTime with phone number "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("Apple' iphone is having a faceTime with email "+email);
    }


    }

/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */
