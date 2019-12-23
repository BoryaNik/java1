package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {
    private byte number;
    ByteInteger(byte number){
        this.number = number;
    }
    ByteInteger(String str){
        number = Byte.parseByte(str);
    }
    public String toString(){
        return String.valueOf(number);
    }

}
