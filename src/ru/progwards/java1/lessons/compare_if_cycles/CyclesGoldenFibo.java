package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
        if(number>=0&&number<=1)
            return true;
        else {return false;}
    }
    public static int fiboNumber(int n){
        if (n == 3)
        return fiboNumber (2);
            if(n==10);
            return fiboNumber(55);


    }
    public static boolean isGoldenTriangle(int a, int b, int c){
        if ((a == b && b != c && a != c)&&(a <= 1.61703 && b <= 1.61903));
        return isGoldenTriangle(a,b,c);
    }

    public static void main(String[] args) {
        long first = 1;
        long next = 1;
        long current;
        System.out.println(first);
        System.out.println(next);
        for (int i = 1; i <= 8; i++) {
            current = first + next;
            first = next;
            next = current;
            System.out.println(current);
        }
    }

}

