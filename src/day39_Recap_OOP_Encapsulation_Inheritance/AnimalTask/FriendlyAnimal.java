package day39_Recap_OOP_Encapsulation_Inheritance.AnimalTask;

public class FriendlyAnimal extends Animal {

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }


    public void play() {
        System.out.println(name + " " + breed + "is playing");
    }

    public void pet() {
        System.out.println(name + " " + breed + "is petted");
    }

    public void eat(){
        System.out.println(name + " " + breed + " is eating");

}

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */