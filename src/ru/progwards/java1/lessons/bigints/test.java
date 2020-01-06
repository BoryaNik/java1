package ru.progwards.java1.lessons.bigints;

public class test {
    public static void main(String[] args) {
        AbsInteger num1 = new ByteInteger((byte)15);
        AbsInteger num2 = new ShortInteger((short)314);
        System.out.println(AbsInteger.add(num1, num2));
        System.out.println();
        AbsInteger num3 = new ShortInteger((short) 472);
        AbsInteger num4 = new IntInteger(12);
        System.out.println(AbsInteger.add(num3, num4));
        System.out.println();
        AbsInteger num5 = new ByteInteger((byte) 25);
        AbsInteger num6 = new IntInteger(234);
        System.out.println(AbsInteger.add(num5, num6));

    }
}
