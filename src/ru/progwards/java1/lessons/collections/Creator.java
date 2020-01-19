package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Creator {
    public static Collection<Integer> fillEven(int n) {
        int num=2;
        Collection<Integer>res = new ArrayList<>();
        for(int i=n; i>0;i--){
            num+=2;
            res.add(num);
        }
        return res;

    }
    public static Collection<Integer> fillOdd(int n){
        int num=n*2-1;
        Collection<Integer>res = new ArrayList<>();
        for (int i=n; i>0;i--){
            num-=2;
            res.add(num);
        }
        return res;
    }
    public static Collection<Integer> fill3(int n) {
        Collection<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            switch (i % 3) {
                case 0:
                    res.add(i);
                    break;
                case 1:
                    res.add(i * i);
                    break;
                case 2:
                    res.add(i * i * i);
            }

        }
        return res;
    }

    public static void main(String[] args) {

    }
}
