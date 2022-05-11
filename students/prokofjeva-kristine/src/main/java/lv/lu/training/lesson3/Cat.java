package lv.lu.training.lesson3;

public class Cat {
    private String name;
    private boolean hungry;

    public Cat() {}


    public Cat(String name, boolean hungry){
            this.name = name;
            this.hungry = hungry;
        }

        public String getName(){
        return name;
        }

    public boolean isHungry() {
        return hungry;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setHungry(boolean isHungry){
        this.hungry = isHungry;
    }

}
