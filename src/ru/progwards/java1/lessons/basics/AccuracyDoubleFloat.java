package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){

        return (radius);
    }
    public static float volumeBallFloat(float radius){

        return (radius);
    }
    public static double calculateAccuracy(double radius){
        return (radius);}
    public static void main(String[] args) {
        double R = 6371.2;
        float R1= 6371.2f;
        double Pi = 3.14;
        double a= 4/3*Pi*R*R;
        double b= 4/3*Pi*R1*R1;
        System.out.println("otvet " + a);
        System.out.println("otvet " + b);
        System.out.println("raznica " + a/b);

    }


}

