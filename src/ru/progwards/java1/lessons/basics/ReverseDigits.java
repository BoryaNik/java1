package ru.progwards.java1.lessons.basics;

public class ReverseDigits{
public static int reverseDigits(int number) {
    int result=0;
        while(number>0) {
        result *= 10;
        result += number % 10;
        number /= 10;
    }
        System.out.println(result);
            return result;

}

    public static void main (String[]args) {
        reverseDigits(123);

    }
}
