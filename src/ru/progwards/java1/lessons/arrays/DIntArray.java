package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] n ={};
    DIntArray(){};
    public void add(int num){

        int[] n1 = new int[n.length + 1];//{1,2,3};
        //System.out.println(Arrays.toString(n));
        //n = Arrays.copyOf(n, n.length + 1);
        System.arraycopy(n, 0, n1, 0, n.length);
        n1[n.length] = num;
        n = n1;

    }

    public void atInsert(int pos, int num) {
        int[] n1 = new int[n.length + 1];//{1,2,3};
        System.arraycopy(n, 0, n1, 0, pos);
        System.arraycopy(n, pos , n1, pos+1, n.length - pos );
        n1[pos] = num;
        n = n1;

    }

    public void atDelete(int pos) {
        int[] n1 = new int[n.length - 1];//{1,2,3};
        //n1= Arrays.copyOf(n1,n1.length-1);
        System.arraycopy(n, 0, n1, 0, pos);
        System.arraycopy(n, pos + 1, n1, pos, n.length - pos - 1);
        n = n1;
    }


    public int at(int pos){
        return n[pos];
    }
    @Override
    public String toString() {
        return Arrays.toString(n);
    }

    public void print() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {

    }
    }



