package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c ){
        if(c<(a+b)||a<(b+c)||b<(a+c))
            return true;
        else {return false; }
    }
    public static boolean isRightTriangle(int a, int b, int c){
        if(a*a==c*c+b*b||b*b==a*a+c*c||c*c==a*a+b*b)
            return true;
        else {return false;}
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        if (a==b||b==c||a==c)
            return true;
        else {return false;}
    }
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c=3;
        System.out.println(isTriangle(a,b,c));
        System.out.println(isRightTriangle(a,b,c));
        System.out.println(isIsoscelesTriangle(a,b,c));
    }
}
