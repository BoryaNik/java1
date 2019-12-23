package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    private int number;
    public String toString(){
        return String.valueOf(number);
    }
    IntInteger(int number){
        this.number = number;}
    IntInteger(String str){
        number = Integer.parseInt(str);}
}

