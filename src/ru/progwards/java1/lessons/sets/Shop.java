package ru.progwards.java1.lessons.sets;

import java.util.List;

public class Shop {
    public Shop(List<Product> products){
        this.products=products;
    }
    private List<Product>products;
    public List<Product>getProducts(){
        return products;
    }
}
