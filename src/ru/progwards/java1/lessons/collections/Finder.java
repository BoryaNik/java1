package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Finder {

        public static Collection<Integer> findMinSumPair(Collection<Integer> numbers) {
            if (numbers == null) return null;

            int a = 0;
            int b = 0;
            int c = 0;
            int d;
            int min = Integer.MAX_VALUE;

            for (int num : numbers) {
                if (b > 0) {
                    d = num + a;
                    if (d < min) {
                        min = d;
                        c = b;
                    }
                }
                a = num;
                b++;
            }

            Collection<Integer> result = new ArrayList<>();
            if (c >= 1) result.add(c - 1);
            if (c >= 0) result.add(c);
            return result;
        }

        public static Collection<Integer> findLocalMax(Collection<Integer> numbers){
            if (numbers == null) return null;

            int n1 = Integer.MAX_VALUE;
            int n2 = Integer.MAX_VALUE;
            int x = 0;
            Collection<Integer> result = new ArrayList<>();

            for (int num : numbers) {
                if (x > 1 && n1 > num && n1 > n2) {
                    result.add(n1);
                }
                n2 = n1;
                n1 = num;
                x++;
            }

            return result;
        }

        public static void main(String[] args) {

        }
    }

