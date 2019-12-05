package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        sieve = new boolean[N + 1];
        if(N > 1) {
            Arrays.fill(sieve, true);
            sieve[0] = false;
            sieve[1] = false;
            sift();
        } else {
            Arrays.fill(sieve, false);
        }
    }

    private void sift() {
        int i = sieve.length;
        int x;
        for (int k = 2; k < i; k++)
            if (sieve[k]) {
                x = k * 2;
                while (x < i) {
                    sieve[x] = false;
                    x += k;
                }
            }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes a = new Eratosthenes(10);
        System.out.println(Arrays.toString(a.sieve));
        System.out.println(a.isSimple(10));
    }
}

