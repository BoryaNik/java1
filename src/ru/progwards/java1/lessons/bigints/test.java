package ru.progwards.java1.lessons.bigints;

public class test {
    public static void main(String[] args) {
        AbsInteger n1= new ByteInteger((byte)2);
        AbsInteger n2 = new ShortInteger((short)3);
        AbsInteger res= AbsInteger.add(n1,n2);
        System.out.println(res);


    }
}
