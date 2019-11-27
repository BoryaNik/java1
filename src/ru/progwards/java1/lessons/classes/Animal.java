package ru.progwards.java1.lessons.classes;

public class Animal {
    public Animal(double weight) {double a=getWeight();
    }

    public AnimalKind animalKind = AnimalKind.ANIMAL;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}

    public FoodKind getFoodKind() { FoodKind c= FoodKind.UNKNOWN; return c;}

    enum FoodKind {UNKNOWN, HAY, CORN}

    Animal(AnimalKind animalKind, FoodKind foodKind, double weight, double foodCoeff) {
        this.animalKind = animalKind;

    }


    public double getWeight() { //2.1
        double a=1d;
        return a;
    }
    public double getFoodCoeff(){ //2.2
        double b=0.02;
        return b;
    }

    public double calculateFoodWeight(){ //2.6
        double s =  getWeight()*getFoodCoeff();
        return s;
    }
    public AnimalKind getKind(){return animalKind;}


    //@Override
    public String toStringFull(){
        return ("I am "+getKind()+ ",eat "+ getFoodKind()+" "+calculateFoodWeight());
    }


    public static void main(String[] args) {
        Animal animal = new Animal(203);
        System.out.println(animal);
    }
}
