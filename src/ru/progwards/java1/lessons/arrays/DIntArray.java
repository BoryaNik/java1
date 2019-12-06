package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] n ={};
    DIntArray(){};
    public void add(int num){

        int[] n1 = new int [n.length+1];//{1,2,3};
        System.out.println(Arrays.toString(n));
        n= Arrays.copyOf(n,n.length+1);
        System.out.println(Arrays.toString(n));

    }
    public void atInsert(int pos, int num){
        int[] n1 = new int [n.length+1];//{1,2,3};
        System.arraycopy(n, 0 ,n1, 0,pos);
        System.arraycopy(n1, pos + 1, n1, pos, n1.length - pos - 1);
        System.out.println(Arrays.toString(n));

    }
    public void atDelete(int pos) {
        int[] n1 = new int [n.length-1];//{1,2,3};
        //n1= Arrays.copyOf(n1,n1.length-1);
        System.arraycopy(n, 0 ,n1, 0,pos);
        System.arraycopy(n1, pos + 1, n1, pos, n1.length - pos - 1);
        System.out.println(Arrays.toString(n1));
    }

    public static void main(String[] args) {
        System.out.println();
    }
    public int at(int pos){
        return n[pos];
    }

}

