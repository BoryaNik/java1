package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int b;
    IntInteger(int b){
        this.b=b;
        b=100;
    }
    @Override
    public String toString(){
        return Integer.toString(b);}
}

