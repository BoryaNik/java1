package ru.progwards.java1.lessons.io2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Translator {
    Hashtable<String, String> wordTable;

    Translator(String[] inLang, String[] outLang) {

        if (outLang.length != inLang.length) throw new ArrayIndexOutOfBoundsException("Длины массивов должны быть одинаковы");

        int count = inLang.length;
        wordTable = new Hashtable<String, String>(count);
        for (int i = 0; i < count; i++) {
            wordTable.put(inLang[i].toLowerCase(), outLang[i].toLowerCase());
        }
    }
    public String translateWord(String word) {
        String result = wordTable.get(word.toLowerCase());
        if (result == null) return word;
        if (Character.isUpperCase(word.charAt(0))) {
            return Character.toUpperCase(result.charAt(0)) + (result.length() > 1 ? result.substring(1) : "");
        }
        return result;
    }
    public String translate(String sentence) {
        Map<String, String> map = new HashMap<String, String>();

        int len= sentence.length();
        map.put("make", "твори");
        map.put("love", "любовь");
        map.put("not","не");
        map.put("war","войну");


        String tr ="";

        for (String s : tr.split(" ")) {
            System.out.print(map.get(s) + " ");
        }
        return map.toString();
    }
    public static void main(String[] args){

    }
}
