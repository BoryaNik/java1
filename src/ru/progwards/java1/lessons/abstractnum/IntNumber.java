package ru.progwards.java1.lessons.abstractnum;

public class IntNumber extends Number{
    private int number;
    public IntNumber(int num){number = num;}
    @Override
    public Number mul(Number num){
        Integer nn = number* Integer.parseInt(num.toString());
        return newNumber(nn.toString());
    }
    @Override
    public Number div(Number num){
        Integer nn = number / Integer.parseInt(num.toString());
        return newNumber(nn.toString());
    }
    @Override
    public Number newNumber(String strNum){
        return new IntNumber(Integer.parseInt(strNum));
    }
    @Override
    public  String toString(){
        return ((Integer)number).toString();

    }
}

