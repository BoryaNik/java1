package ru.progwards.java1.lessons.sets;

public class Product {
    public Product(String code){
        this.code=code;
    }
    private String code;
    public String getCode(){
        return code;
    }
    @Override
    public String toString(){
        return code;
    }
}
