package lv.lu.training.HW3;

import lv.lu.training.lesson3.Cat;

public class HWCatOwner {
        public static void main(String[] args) {
            HWCat myHWCat = new HWCat("Tom", "black", 5);

            System.out.println("My cat's color - " + myHWCat.getColor());
            System.out.println("name - " + myHWCat.getName());
            System.out.println("species - " + myHWCat.getSpecies());
            System.out.println("age - " + myHWCat.getAge());
            System.out.println("weight - " + myHWCat.getWeight());


        }

    }
