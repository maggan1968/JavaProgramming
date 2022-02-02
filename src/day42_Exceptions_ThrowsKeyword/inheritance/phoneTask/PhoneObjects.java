package day42_Exceptions_ThrowsKeyword.inheritance.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {



    IPhone iphone = new IPhone("IPhone 12", "6.7 inches",1000, "Black");
    Samsung samsung = new Samsung("Z Fold3","12 inches", 2000, "black");
    Nokia nokia = new Nokia("Brick"," 4 inches", 50, "Grey");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(12345678);
        iphone.faceTime(577777999);
        iphone.faceTime("hhuo@gmail.com");


        System.out.println("-------------------------------------------------------");
        samsung.call(911);
        samsung.text(12345678);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("----------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(nokia.hasBattery);
        System.out.println(IPhone.hasBattery);
    }}
/*
1.5 Create a class named Phone Objects and test of the sub class' objects


 */
