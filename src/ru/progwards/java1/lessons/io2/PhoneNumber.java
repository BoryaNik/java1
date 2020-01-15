package ru.progwards.java1.lessons.io2;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class PhoneNumber {
    public static String format(String phone) {
        String num = phone.replaceAll("[^\\d]", "");
        int len = num.length();
        if(len < 10 || len > 11) {
            throw new RuntimeException("");
        }
        return "+" + (num.charAt(0)=='8' ? "7" : num.substring(0,1))
                + "(" + num.substring(1,4) + ")"
                + num.substring(4,7) + "-" + num.substring(7);

    }
        public static void main (String[]args){

        }
    }
