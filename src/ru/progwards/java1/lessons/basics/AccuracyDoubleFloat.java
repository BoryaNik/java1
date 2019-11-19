package ru.progwards.java1.lessons.basics;
public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        return 4.0/3.0*3.14*6371.2*6371.2*6371.2;
    }
    public static float volumeBallFloat(float radius){

        return (float)  (4.0f/3.0f*3.14f*6371.2f*6371.2f*6371.2f);
    }
    public static double calculateAccuracy(double radius){
        return (4.0/3.0*3.14*6371.2*6371.2*6371.2)-(4f/3f*3.14f*6371.2f*6371.2f*6371.2f);
    }
    public static void main(String[] args) {

        double radius =6371.2;
        //float radius =6371.2;
        double volumeBallDouble= 4.0/3.0*3.14*6371.2*6371.2*6371.2;
        float volumeBallFloat = (float) (4f/3f*3.14f*6371.2f*6371.2f*6371.2f);
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(volumeBallDouble-volumeBallFloat);
    }
}
