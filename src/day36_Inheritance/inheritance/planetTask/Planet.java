package day36_Inheritance.inheritance.planetTask;

public class Planet {

    public String name;
    public long mass;
    public long radius;
    public long surfaceGravity;
    public long surfaceArea;
    public double volume;
    public long population;

    public Planet(String name, long mass, long radius, long surfaceGravity, long surfaceArea,
                  double volume, long population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
/*
Planet Task:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()
 */