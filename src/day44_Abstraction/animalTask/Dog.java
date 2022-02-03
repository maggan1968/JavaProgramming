package day44_Abstraction.animalTask;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
        @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void eat(){
        System.out.println(getName()+" is eating cat food");
    }

}
