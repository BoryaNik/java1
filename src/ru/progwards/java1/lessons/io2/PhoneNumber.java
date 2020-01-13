package ru.progwards.java1.lessons.io2;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class PhoneNumber {
    private String printPhone(Long phoneNum) {
        StringBuilder sb = new StringBuilder(15);
        StringBuilder temp = new StringBuilder(phoneNum.toString());

        while (temp.length() < 10)
            temp.insert(0, "0");

        char[] chars = temp.toString().toCharArray();

        sb.append("+7(");
        for (int i = 0; i < chars.length; i++) {
            if (i == 3)
                sb.append(")");//+7(123)456-8989
            else if (i == 6)
                sb.append("-");
            sb.append(chars[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}

