package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {
    byte a;

    ByteInteger(byte a) {
        this.a = a;
        n = 1;

    }

    @Override
    public String toString() {
        return Byte.toString(a);
    }

}
