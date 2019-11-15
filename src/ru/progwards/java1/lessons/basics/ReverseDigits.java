package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
    int a= number % 10;
    int b= (number-a) / 10;
    int c= b% 10;
    int d= b/10;

        System.out.print(a);
        System.out.print(c);
        System.out.print(d);
        return a;
}
    public static void main (String[]args) {
        reverseDigits(246);

    }
}
