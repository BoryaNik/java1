package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    public void add(int num){

        int[] n = new int []{1,2,3};
        System.out.println(Arrays.toString(n));
        n= Arrays.copyOf(n,n.length+1);
        System.out.println(Arrays.toString(n));

    }
    public void atInsert(int pos, int num){
        int[] n = new int []{1,2,3};
        System.out.println(Arrays.toString(n));
        n= Arrays.copyOf(n,n.length+1);
        System.out.println(Arrays.toString(n));

    }
    public void atDelete(int pos) {
        int[] n = new int []{1,2,3};
        System.out.println(Arrays.toString(n));
        n= Arrays.copyOf(n,n.length-1);
        System.out.println(Arrays.toString(n));
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
