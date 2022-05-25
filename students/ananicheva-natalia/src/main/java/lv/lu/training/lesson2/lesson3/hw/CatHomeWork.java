package lv.lu.training.lesson2.lesson3.hw;

public class CatHomeWork {
    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;

    public CatHomeWork(String color, String name, int weight, int age, String species) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.species = species;
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


    public int getWeight() {
        return weight;
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

    public void setWeight(int weight) {
        this.weight = weight;

    }
}
