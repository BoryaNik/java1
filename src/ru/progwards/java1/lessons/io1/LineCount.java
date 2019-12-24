package ru.progwards.java1.lessons.io1;

import java.io.*;

public class LineCount {
    public static void main(String[] args) throws IOException {

        System.out.println(calcEmpty("\n"));
    }

    public static int calcEmpty(String fileName) throws IOException {
        final BufferedReader br = new BufferedReader(new StringReader("hello\n\nworld\n"));
        String line;
        int empty = 0;
        int error =-1;
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                empty++;
            }else
                return error;
        }
        System.out.println(empty);
        return empty;
    }
}
