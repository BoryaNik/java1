package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter){
        try {

            // создаем экземпляр класса FileReader
            FileReader t = new FileReader(inFileName);
            // создаем в памяти буфер для чтения 8Кб символов за раз
            FileWriter fileWriter = new FileWriter(outFileName);
            char[] buffer = new char[8096];

            int chars = t.read(buffer);

            // до тех пор пока есть символы в файле, читаем данные
            // и выводим в консоль
            while (chars != -1) {
                System.out.println(String.valueOf(buffer, 0, chars));
                chars = t.read(buffer);
            }

            // закрываем файл
            t.close();

            // отлавливаем исключение
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
    private static String deleteFilterChars (String s, String filter) {
        StringBuilder delet = new StringBuilder();
        int del = s.length();
        for (int i = 0; i < del; i++) {
            if (filter.indexOf(s.charAt(i)) < 0)
                delet.append(s.charAt(i));
        }
        return delet.toString();
    }


    public static void main(String[] args) {
        filterFile("C:\\Users\\Боря\\Desktop\\java12.txt","\\C:\\\\Users\\\\Боря\\\\Desktop\\java12.txt\\","-' '().");
    }

}
