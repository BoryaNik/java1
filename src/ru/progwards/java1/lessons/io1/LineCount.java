package ru.progwards.java1.lessons.io1;

import java.io.File;
import java.io.FileInputStream;

public class LineCount {
    public static int calcEmpty(String fileName) throws Exception {
File file = new File("data");
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringsArray = data.split("\r\n");
        System.out.println(" "+ stringsArray.length);
        return -1;
    }

    public static void main(String[] args) {

    }
}
