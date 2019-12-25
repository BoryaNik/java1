package ru.progwards.java1.lessons.io1;

import java.io.*;
import java.util.Scanner;

public class LineCount {
    public static int calcEmpty(String fileName) {
        int result = 0;
        int result1 = -1;
        String line= "";

        try (FileReader reader = new FileReader(fileName);
             Scanner scan = new Scanner(reader)) {
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                if(str.trim().isEmpty())
                    result++;
            }
        } catch (FileNotFoundException e) {
            result = result1;
        } catch (IOException e) {
            result = result1;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
