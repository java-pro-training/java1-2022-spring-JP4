package lv.lu.training.lesson3;

//IESK
//Lietojam koda formatēšanu: CTRL+ALT+L
public class Cat1 {
    private String color;
    private String name;
    private String species;
    private String age;
    private int weight;

    public Cat1(String color, String name, int weight) {
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

    public String newSpecies() {
        return species;

    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public String newAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String setAge() {
        return age;
    }


    public String setSpecies() {
        return species;
    }
}

