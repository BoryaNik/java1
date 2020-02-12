package ru.progwards.java1.lessons.maps;

import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SalesInfo {
    public static Map<String,Double> goods;
    public static Map<String, AbstractMap.SimpleEntry<Double, Integer>> cust;
    public static int loadOrders(String fileName){
        goods=new TreeMap<String,Double>();
        cust = new TreeMap<String, AbstractMap.SimpleEntry<Double, Integer>>();
        int res=0;
        try (FileReader s= new FileReader(fileName);
             Scanner scanner = new Scanner(s)){
            while (scanner.hasNext()){
                res+=processLine(scanner.nextLine());
            }

        }catch (IOException e){throw  new RuntimeException(fileName+ ":\n" + e.getMessage());}
        return res;
    }
    public static int processLine(String str){
        String[] words = str.split(",");
        if(words.length==4){
            try {
                String fio = words[0].trim();
                String good = words[1].trim();
                int cnt = Integer.parseInt(words[2].trim());
                double sum= Double.parseDouble(words[3].trim());

                goods.put(good,goods.containsKey(good)?goods.get(good)+sum : sum);

                if(cust.containsKey(fio)){
                    AbstractMap.SimpleEntry<Double,Integer>simpleEntry = cust.get(fio);
                    sum+=simpleEntry.getKey();
                    cnt+=simpleEntry.getValue();
                }
                cust.put(fio,new AbstractMap.SimpleEntry<Double, Integer>(sum,cnt));
                return 1;
            }
            catch (Exception e){}
        }
        return 0;
    }
    public static Map<String,Double>getGoods(){
        return goods;
    }
    public static Map<String,AbstractMap.SimpleEntry<Double,Integer>>getCustomers(){
        return cust;
    }

    public static void main(String[] args) {

    }
}
