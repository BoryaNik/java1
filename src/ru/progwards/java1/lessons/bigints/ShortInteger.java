package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    short num;
    public ShortInteger(short num) {
        this.num = num;
        b = 2;
    }
    @Override
    public String toString() {
        return Short.toString(num);
    }
    @Override
    protected int intValue() {
        return num;
    }
    @Override
    protected short shortValue() {
        return num;
    }
    @Override
    protected AbsInteger addTwo(AbsInteger num1) {
        return new ShortInteger((short)(num + num1.shortValue()));
    }
}
