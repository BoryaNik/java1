package ru.progwards.java1.lessons.arrays;

public class ArraySort {
    public static void main(String[] args) {
    }
    public static void sort(int[] a){
        for(int i=0; i<a.length;i++){
            int min = a[i];
            int min_i=i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    min_i=j; }
            }
            if(i != min_i){
                int b =a[i];
                a[i]=a[min_i];
                a[min_i]=b;
                System.out.println(a[i]);
            }
        }
    }
}
