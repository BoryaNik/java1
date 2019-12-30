package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;

public class ArrayInteger { //3.0
    byte[] digits;
    int number;
    ArrayInteger() {
        int n = 10;
        digits = new byte[n];
        clear(n);
    }
    ArrayInteger(int n) {
        digits = new byte[n];
        clear(n);
    }
    ArrayInteger(String value) {
        this();
        fromString(value);
    }
    private void clear() {
        clear(number);
    }
    private void clear(int count) {
        for (int i = 0; i < count; i++) digits[i] = 0;
        number = 0;
    }
    void fromString(String value) {
        char[] s = value.toCharArray();
        int sig = s.length;
        // переведем массив к числовому
        for (int i = sig - 1, k = 0; i >= 0; i--, k++) {
            digits[k] = (byte) (s[i] - '0');
        }
        // обнулим ранее использовавшиеся
        for (int i = sig; i < number; i++) {
            digits[i] = 0;
        }
        number = sig;
    }
    void fromInt(BigDecimal value) {
        fromString(value.toString());
    }
    BigDecimal toInt() {
        char[] s = new char[number];
        for (int i = number - 1, k = 0; i >= 0; i--, k++) {
            s[i] = (char)((digits[k] + '0') & 0xFF);
        }
        return new BigDecimal(s);
    }

    boolean raiseCalcError(){
        clear(digits.length);
        return false;
    }
    boolean add(ArrayInteger num) {
        int sigMax = num.number >= number ? num.number : number; // max significant
        int l = digits.length;
        int ln = num.digits.length;
        int p = 0; // перенос
        int r; // результат для цифр
        int sig = 0; // ИНДЕКС последнего значащего
        for (int i = 0; i <= sigMax; i++) {
            r = p;
            if (i < l) r += digits[i];
            if (i < ln) r += num.digits[i];
            if (r > 0) {
                sig = i;
                if (sig >= l) return raiseCalcError();
                digits[sig] = (byte) (r % 10);
            } else {
                if (i < l) digits[i] = 0;
            }
            p = r / 10;
        }
        number = sig + 1;
        return true;
    }

    @Override
    public String toString() {
        byte[] r = new byte [number];
        for (int i = number - 1, k = 0; i >= 0; i--, k++) {
            r[k] = (byte) (digits[i] + '0');
        }
        return new String(r);
    }

    public static void main(String[] args) {

    }

}
