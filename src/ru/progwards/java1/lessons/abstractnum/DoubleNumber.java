package ru.progwards.java1.lessons.abstractnum;

public class DoubleNumber extends Number{
    private double number;

    public DoubleNumber(double num){
        number = num;
    }
    @Override
    public  Number mul(Number num){
        Double nn = number* Double.parseDouble(num.toString());
        return  newNumber(nn.toString());
    }
    @Override
    public Number div(Number num){
        Double nn = number / Double.parseDouble(num.toString());
        return newNumber(nn.toString());}
    @Override
    public Number newNumber(String strNum){
        return new DoubleNumber(Double.parseDouble(strNum));
    }
    @Override
    public String toString(){
        return ((Double)number).toString();
    }
}

