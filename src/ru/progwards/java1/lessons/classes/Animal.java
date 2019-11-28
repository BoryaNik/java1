package ru.progwards.java1.lessons.classes;

public class Animal {
static enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
static enum FoodKind {UNKNOWN, HAY, CORN}

    private AnimalKind animalKind = AnimalKind.ANIMAL;
    private FoodKind foodKind = FoodKind.UNKNOWN;

    private double weight = 1d;
    double foodCoeff = 0.02;

    Animal() {
    }

    Animal(double weight) {
        this.weight = weight;
    }

    Animal(AnimalKind animalKind, FoodKind food, double weight, double foodCoeff) {
        this.animalKind = animalKind;
        this.foodKind = food;
        this.weight = weight;
        this.foodCoeff = foodCoeff;
    }

    public AnimalKind getKind() {
        return animalKind;
    }

    public FoodKind getFoodKind() {
        return foodKind;
    }

    @Override
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    public double getWeight() {
        return weight;
    }

    void setFoodCoeff(double foodCoeff) {
        this.foodCoeff = foodCoeff;
    }
    public double getFoodCoeff() {
        return foodCoeff;
    }
    public double getCoeff() {
        return foodCoeff;
    }


    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }
    public String toStringFull()
    {return "I am"+animalKind +",eat"+foodCoeff+calculateFoodWeight();}
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
    }

}

