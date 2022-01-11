package day35_Encapsolation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Daniel");
        p1.setAge(26);

       // System.out.println(p1.name()+" : "+p1.age());

        System.out.println(p1.getName()+" : "+p1.getAge());

    }
}
