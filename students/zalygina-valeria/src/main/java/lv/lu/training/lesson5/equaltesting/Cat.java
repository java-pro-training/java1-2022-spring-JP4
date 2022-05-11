package lv.lu.training.lesson5.equaltesting;

public class Cat {

    private String name;
    private int weight;
    private int age;

    public Cat(String name, int weight, int age) {
        this.name= name;
        this.weight = weight;
        this.age = age;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (weight != cat.weight) return false;
        if (age != cat.age) return false;
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + age;
        return result;
    }

    public void setAge(int age) {
        this.age = age;

    }
}


