package ru.progwards.java1.lessons.interfaces;

public class Hamster extends Animal {
    static double foodCoeff = 0.03;

    Hamster() {
        super(AnimalKind.HAMSTER, FoodKind.CORN, 0d, foodCoeff);
    }

    Hamster(double weight) {
        super(AnimalKind.HAMSTER, FoodKind.CORN, weight, foodCoeff);
    }

    public static void main(String[] args) {
        Hamster animal = new Hamster(5);
        System.out.println(animal);
    }
}
