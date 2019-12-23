package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {
    private short number;
    public String toString(){
        return String.valueOf(number);
    }
    ShortInteger(short number){
        this.number = number;}
    ShortInteger(String str){
        number = Short .parseShort(str);}
}
