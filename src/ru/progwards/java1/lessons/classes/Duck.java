package ru.progwards.java1.lessons.classes;

public class Duck extends Animal{
    static double foodCoeff = 0.04;

    Duck() {
        super(AnimalKind.DUCK, FoodKind.CORN, 0.04, foodCoeff);
    }

    Duck(double weight) {
        super(AnimalKind.DUCK, FoodKind.CORN, weight, foodCoeff);
    }

    public static void main(String[] args) {
        Duck animal = new Duck(0.04);
        System.out.println(animal);
    }
}
