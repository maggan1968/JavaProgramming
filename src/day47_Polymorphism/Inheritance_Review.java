package day47_Polymorphism;

public class Inheritance_Review {

    int a;
    public Inheritance_Review(int a){
        System.out.println("Parent class' constructor");
    }
    void method1(){

    }
}


    class A extends Inheritance_Review{

    public A(int a) {// constructor
        super(a);
    }
}
    class Aa extends A{

    public Aa(int a) {
        super(a);
    }
}

    class B extends Inheritance_Review{

    public B(int a) {//constructor
        super(a);
    }
}
    class Bb extends B{

    public Bb(int a) {
        super(a);
    }
}

    class C extends Inheritance_Review{
    class Cc extends C{

        public Cc(int a) {
            super(a);
        }
    }

    public C(int a) {//constructor
        super(a);
    }

        class D{
            void m(){
                super.toString(); // Object class
        }
    }
}