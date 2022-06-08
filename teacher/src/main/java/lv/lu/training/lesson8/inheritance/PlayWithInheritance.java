package lv.lu.training.lesson8.inheritance;

public class PlayWithInheritance {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike("Trek", "black", 24);
//        mountainBike.color = "yellow";
        mountainBike.setColor("yellow");

        System.out.println(mountainBike.toString());

    }
}
