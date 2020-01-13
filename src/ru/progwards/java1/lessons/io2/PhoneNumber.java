package ru.progwards.java1.lessons.io2;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class PhoneNumber {

    public static String format(String phone){
        long phoneNum = 123456789L;
        System.out.println(String.valueOf(phoneNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "+7($1)-$2$3"));
        return phone;}

    public static void main(String[] args) {

    }
}

