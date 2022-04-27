package lv.lu.training.lesson3;

public class DogOwner {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.println(myDog.age);

        Dog myFriendDog = new Dog(1, "Reksis", false);
        System.out.println(myFriendDog.name);
    }

}
