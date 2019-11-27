package ru.progwards.java1.lessons.classes;

public class Duk extends Animal{
    static double foodCoeff = 0.04;

    Duk() {
        super(AnimalKind.DUCK, FoodKind.CORN, 0.04d, foodCoeff);
    }

    Duk(double weight) {
        super(AnimalKind.DUCK, FoodKind.CORN, weight, foodCoeff);
    }

    public static void main(String[] args) {
        Duk animal = new Duk(3);
        System.out.println(animal);
    }
}
