package day45_Abstaction_Interface;

public interface PropertiesOf_Interface {


    int a = 100;//static & final by default
    static int b = 200;// final by default

   /* public PropertiesOf_Interface(int a){
       this.a=a;
    */

   /* static {
        b = 100;
    }


    public void method1(){
        System.out.println("Instance method");
    }
    */
    public static void method2(){
        System.out.println("Instance method2");
    }
    public abstract void method3();


    public default void method4(){
        System.out.println("Default method");
    }
}
class Test implements PropertiesOf_Interface {

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();
    }
}