package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductAnalytics {
    private List<Shop> shops;
    private List<Product>products;
    public ProductAnalytics(List<Product>products,List<Shop>shops){
        this.products=products;
        this.shops=shops;
    }
    public Set<Product> existhAll(){
        if(products==null|| products.size()==0)
            return new HashSet<>();
        if(shops==null|| shops.size()==0)
            return new HashSet<>();
        Set<Product>products = new HashSet<Product>();
        return products;
    }
    //public Set<Product>existAtListInOne(){
    //  return existOnlyInOne();}
    public Set<Product>notExistInShops(){
        if(products==null||products.size()==0)
            return new HashSet<>();
        Set<Product>products = new HashSet<Product>();
        if(shops==null||shops.size()==0)
            return products;
        Iterator n= shops.iterator();
        while (n.hasNext()){
            products.removeAll(new HashSet<Product>(((Shop)n.next()).getProducts()));
        }
        return products;
    }

    /* public Set<Product> existOnlyInOne(){
         Set<Product>products=new HashSet<Product>();
         if(products==null||products.size()==0)
             return products;
         if(shops==null|| shops.size()==0)
             return products;
     }*/
    public static void main(String[] args) {

    }
}
