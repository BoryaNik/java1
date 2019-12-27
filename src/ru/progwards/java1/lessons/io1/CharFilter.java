package ru.progwards.java1.lessons.io1;

import java.io.*;
import java.util.Scanner;

public class CharFilter {
    private static String deleteFilterChars (String s, String filter) {
        StringBuilder delet = new StringBuilder();
        int del = s.length();
        for (int i = 0; i < del; i++) {
            if (filter.indexOf(s.charAt(i)) < 0)
                delet.append(s.charAt(i));
        }
        return delet.toString();
    }


    public static void filterFile(String inFileName,String outFileName, String filter) throws IOException{

        FileReader fileReader = new FileReader( inFileName);
        Scanner scanner  = new Scanner(fileReader);
        PrintStream out = new PrintStream(new FileOutputStream(outFileName));
        while (scanner.hasNextLine()){
            String strFromFile = scanner.nextLine();
            System.out.println(strFromFile);
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

    }

}
