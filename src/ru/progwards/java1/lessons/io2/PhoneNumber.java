package ru.progwards.java1.lessons.io2;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class PhoneNumber {

        public static final DecimalFormat phoneFormatD = new DecimalFormat("0000000000");
        public static final MessageFormat phoneFormatM = new MessageFormat("({0}){1}-{2}");

        public static void main(String[] args) {
            try {
                System.out.println(format("8091231234"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                System.out.println(format("78091231234"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static String format(String phone) throws Exception {

            double p = 0;
            if (phone instanceof String)
                p = Double.valueOf((String) phone);

            if (p == 0 || String.valueOf(p) == "" || String.valueOf(p).length() < 7)
                throw new Exception("");

            String str = phoneFormatD.format(p);

            String num = str.length() > 10 ? str.substring(0, str.length() - 10) : "";
            str = str.length() > 10 ? str.substring(str.length() - 10, str.length()) : str;

            String[] arr = {
                    (str.charAt(0) != '0') ? str.substring(0, 3) : (str.charAt(1) != '0') ? str.substring(1, 3) : str.substring(2, 3),
                    str.substring(3, 6),
                    str.substring(6)
            };
            String r = phoneFormatM.format(arr);
            r = (r.contains("(0)")) ? r.replace("(0)", "") : r;
            r = (num != "") ? ("+" + num + "" + r) : r;
            return (r);
        }
    }

