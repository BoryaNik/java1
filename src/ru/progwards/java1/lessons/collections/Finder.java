package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

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
    public static boolean findSequence(Collection<Integer> numbers){
        if (numbers == null) return false;
        int size = numbers.size();
        if (size == 0) return false;

        BitSet s = new BitSet(size + 1);
        int i = 1;
        int num;

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            num = iterator.next();
            if (num < 1 || num > size) {
                return false;
            }
            s.set(num, true);
            i++;
        }

        for (i = 1; i <= size; i++) {
            if (s.get(i)) continue;
            else return false;
        }

        return true;
    }
    public static String findSimilar(Collection<String> names){
        if (names == null) return null;
        if (names.size() == 0) return null;
        //if (names.size() == 1) return names.iterator().next();

        String maxString = "";
        int maxCount = 0;
        String curString = "";
        int curCount = 0;
        Iterator i = names.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            if (s.compareTo(curString) == 0) {
                curCount++;
            } else {
                if (curCount > maxCount) {
                    maxString = curString;
                    maxCount = curCount;
                }
                curCount = 1;
                curString = s;
            }
        }
        if (curCount > maxCount) {
            maxString = curString;
            maxCount = curCount;
        }

        return maxString + ":" + maxCount;
    }

        public static void main(String[] args) {

        }
    }

