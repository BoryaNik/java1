package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    int num;
    public IntInteger(int num) {
        this.num = num;
        b = 4;
    }
    @Override
    public String toString() {
        return Integer.toString(num);
    }
    @Override
    protected int intValue() {
        return num;
    }
    @Override
    protected AbsInteger addTwo(AbsInteger num1) {
        return new IntInteger((int)(num + num1.intValue()));
    }
}

