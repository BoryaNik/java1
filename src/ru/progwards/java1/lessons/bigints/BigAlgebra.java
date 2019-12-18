package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {
    static BigDecimal fastPow(BigDecimal num, int pow) {
switch (pow) {
        case 0: return BigDecimal.ONE;
        case 1: return num;
        case 2: return num.multiply(num);
    }
    int pow2 = pow / 2;
    BigDecimal t = num.multiply(num);
        return pow % 2 == 0 ? fastPow(t, pow2) : num.multiply(fastPow(t, pow2));

    }


    static BigInteger fibonacci(int n) {
        BigInteger[] arr = new BigInteger[n + 1];

        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;
        arr[2] = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }
             return (arr[n]);
        //System.out.println(arr[n]);
    }
    public static void main(String[] args) { }
}

