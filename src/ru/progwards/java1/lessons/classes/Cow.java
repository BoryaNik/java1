package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    static double foodCoeff = 0.05;
    Cow(){super(AnimalKind.COW, FoodKind.HAY,0.05d,foodCoeff);}
    Cow(double weight){super(AnimalKind.COW,FoodKind.HAY,0.05d,foodCoeff);}

    public static void main(String[] args) {
        Cow animal =new Cow(0.05);
        System.out.println(animal);

    }
}
