package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//import static com.sun.org.apache.xml.internal.serializer.Version.getProduct;

public class ProductAnalytics {
    private List<Shop> shops;
    private List<Product>allProducts;
    public ProductAnalytics(List<Product>products,List<Shop>shops){
        this.allProducts=products;
        this.shops=shops;
    }
    public Set<Product> existInAll(){
        if(allProducts==null|| allProducts.size()==0)
            return new HashSet<>();
        if(shops==null|| shops.size()==0)
            return new HashSet<>();
        Set<Product>products = new HashSet<Product>(allProducts);
        Iterator n= shops.iterator();
        while (n.hasNext()){
            products.retainAll(new HashSet<Product>(((Shop) n.next()).getProducts()));
        }
        return products;
    }
    public Set<Product>existAtListInOne(){
     return existOnlyInOne();}

    public Set<Product>notExistInShops(){
        if(allProducts==null||allProducts.size()==0)
            return new HashSet<>();
        Set<Product>products = new HashSet<Product>(allProducts);
        if(shops==null||shops.size()==0)
            return products;
        Iterator n= shops.iterator();
        while (n.hasNext()){
            products.removeAll(new HashSet<Product>(((Shop)n.next()).getProducts()));
        }
        return products;
    }

    public Set<Product> existOnlyInOne(){
         Set<Product>products=new HashSet<Product>();
         if(allProducts==null||allProducts.size()==0)
             return products;
         if(shops==null|| shops.size()==0)
             return products;
         for(int i=0; i<shops.size();i++){
             Set<Product>products1 = new HashSet<Product>();
         Set<Product>products2 = new HashSet<Product>();
         Set<Product>products3;
         Iterator n = shops.iterator();
         for (int k=0;k<shops.size();k++){
             products3 = new HashSet<Product>(((Shop)n.next()).getProducts());
             products3.retainAll(products);
             if(k<i){products1.addAll(allProducts);}
             else if(k==i){
                 products2=products3;
                 products2.removeAll(products1);
             }else {products2.removeAll(products1);
             }
         }
             products.addAll(products2);
         }
         return products;

     }
    public static void main(String[] args) {

    }
}
