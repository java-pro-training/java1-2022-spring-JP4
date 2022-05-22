package lv.lu.training.lesson2.lesson3;

public class Cat {
    private String name;
    private boolean hungri;

    public Cat() {

    }

    public Cat(String name, boolean hungri){
         this.name = name;
         this.hungri = hungri;

     }
     public String getName(){
        return name;

     }
     public boolean isHungri(){
        return hungri;

     }
     public void setName(String newName){
        this.name = newName;

     }

    public void setHungri(boolean ishungri) {
        this.hungri = ishungri;
    }
}
