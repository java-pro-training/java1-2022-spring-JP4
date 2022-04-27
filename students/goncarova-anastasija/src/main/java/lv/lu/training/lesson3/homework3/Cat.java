package lv.lu.training.lesson3.homework3;
//IESK
//Lietot koda formatēšanu: Ctrl+Alt+L
public class Cat {
    private String color;
    private String name;
    private String species;
    private int age;
    private float weight;


public Cat(String color, String name, int weight) {
    this.color = color;
    this.name = name;
    this.weight = weight;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cat(String color, String name, float weight) {
     this.color = color;
     this.name = name;
     this.weight = weight;

    }
}
