package lv.lu.training.lesson3;

public class Cat {
    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;

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

    public void setName() {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies() {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }
}
