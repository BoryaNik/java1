package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    static int checkBit(byte value, int bitNumber) {
        return value >>bitNumber & 1;
    }
}
