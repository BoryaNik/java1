package ru.progwards.java1.lessons.io2;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class PhoneNumber {


        public static final DecimalFormat phoneFormatD = new DecimalFormat("0000000000");
        public static final MessageFormat phoneFormatM = new MessageFormat("({0}){1}-{2}");

        // Example Method on a Main Class
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

            try {
                System.out.println(format(""));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public static String format(String phone) throws Exception {

            double p = 0;

            if (phone instanceof String)
                p = Double.valueOf((String) phone);



            if (p == 0 || String.valueOf(p) == "" || String.valueOf(p).length() < 7)
                throw new Exception("Paramenter is no valid");

            String fot = phoneFormatD.format(p);

            String extra = fot.length() > 10 ? fot.substring(0, fot.length() - 10) : "";
            fot = fot.length() > 10 ? fot.substring(fot.length() - 10, fot.length()) : fot;

            String[] arr = {
                    (fot.charAt(0) != '0') ? fot.substring(0, 3) : (fot.charAt(1) != '0') ? fot.substring(1, 3) : fot.substring(2, 3),
                    fot.substring(3, 6),
                    fot.substring(6)
            };
            String r = phoneFormatM.format(arr);
            r = (r.contains("(0)")) ? r.replace("(0)", "") : r;
            r = (extra != "") ? ("+" + extra + "" + r) : r;
            return (r);
        }
    }

