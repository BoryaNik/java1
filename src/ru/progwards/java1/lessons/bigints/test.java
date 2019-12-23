package ru.progwards.java1.lessons.bigints;

public class test {
    public static void main(String[] args) {
        IntInteger i1= new IntInteger(2);
        ByteInteger i2 = new ByteInteger((byte)3);
        AbsInteger res= AbsInteger.add(i1,i2);
        System.out.println(res);


    }
}
