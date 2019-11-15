package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        reverseDigits(123);}


    public static void reverseDigits(long number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reverseDigits(number/10);

        }
    }
}
