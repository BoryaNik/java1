package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Creator {
    public static Collection<Integer> fillEven(int n) {
        int num=2;
        Collection<Integer>res = new ArrayList<>();
        for(int i=n; i>0;i--,num+=2)
            res.add(num);
        return res;

    }
    public static Collection<Integer> fillOdd(int n){
        int num=n*2-1;
        Collection<Integer>res = new ArrayList<>();
        for (int i=n; i>0;i--,num-=2)
            res.add(num);

        return res;
    }
    public static Collection<Integer> fill3(int n) {

            Collection<Integer> result = new ArrayList<>();
            int i2;
            for (int i = 0; i < n; i++) {
                result.add(i);
                i2 = i * i;
                result.add(i2);
                result.add(i2 * i);
            }
            return result;
        }


    public static void main(String[] args) {

    }
}
