package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }
    public static int minSide(int a, int b, int c) {
        return Math.min(a,Math.min(b,c));
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        if(a==b&&b==c&&a==c)
            return true;
        else{return  false;}
    }
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c=3;
        System.out.println(maxSide(a,b,c));
        System.out.println(minSide(a,b,c));
        System.out.println(isEquilateralTriangle(a,b,c));
    }
}
