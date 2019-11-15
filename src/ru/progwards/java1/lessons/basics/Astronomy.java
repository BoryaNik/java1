package ru.progwards.java1.lessons.basics;

public class Astronomy {

        public static Double sphereSquare(Double r) {

            double Pi = 3.14;
            double s=4*Pi*r*r;
            return s;

        }
        public static Double earthSquare(){
            double a=6371.2;
            double Pi = 3.14;
            double s=4*Pi*a*a;
            return s;
        }
        public static Double mercurySquare(){
            double b =2440;
            double Pi = 3.14;
            double s=4*Pi*b*b;
            return s;
        }
        public static Double jupiterSquare(){
            double c =71492;
            double Pi = 3.14;
            double s=4*Pi*c*c;
            return s;
        }
        public static Double earthVsMercury(){
            return (earthSquare()/mercurySquare());}
        public static Double earthVsJupiter(){
            return (earthSquare()/jupiterSquare());}

        public static void main(String[] args) {

            System.out.println(""+ sphereSquare((double)2));
            System.out.println(""+ earthSquare());
            System.out.println(""+mercurySquare());
            System.out.println(jupiterSquare());
            System.out.println(earthSquare()/mercurySquare());
            System.out.println(earthSquare()/jupiterSquare());


        }
    }


