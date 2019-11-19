package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){

        return volumeBallDouble (radius);
    }
    public static float volumeBallFloat(float radius){

        return volumeBallFloat(radius);
    }
    public static double calculateAccuracy(double radius){
        return calculateAccuracy (radius);
    }
    public static void main(String[] args) {
        float Pi = 3.14f;
        double volumeBallDouble= 4.0/3.0*3.14*6371.2*6371.2*6371.2;
        double volumeBallFloat = 4/3*3.14f*6371.2*6371.2*6371.2;
        System.out.println(volumeBallDouble);
        System.out.println(volumeBallFloat);
        System.out.println(volumeBallDouble/volumeBallFloat);


    }


}

