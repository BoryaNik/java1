package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {
    byte num;
    public ByteInteger(byte num) {
        this.num = num;
        b = 1;
    }
    @Override
    public String toString() {
        return Byte.toString(num);
    }
    @Override
    protected byte byteValue() {
        return num;
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
        return new ByteInteger((byte)(num + num1.byteValue()));
    }
}