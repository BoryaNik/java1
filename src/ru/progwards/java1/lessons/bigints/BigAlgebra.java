package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {

    static BigDecimal fastPow(BigDecimal num, int pow){
        BigDecimal b1 = new BigDecimal("924567");
        int n = 5;
        BigDecimal result = b1.pow(n); {return result;}
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

