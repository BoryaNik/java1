package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    static double foodCoeff = 0.03;

    Hamster() {
        super(AnimalKind.HAMSTER, FoodKind.CORN, 0.03, foodCoeff);
    }

    Hamster(double weight) {
        super(AnimalKind.HAMSTER, FoodKind.CORN, weight, foodCoeff);
    }

    public static void main(String[] args) {
        Hamster animal = new Hamster(12.3);
        System.out.println(animal);
    }
}
