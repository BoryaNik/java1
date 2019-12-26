package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFilter {
    public static void filterFile(String inFileName,String outFileName, String filter) {
        try {
            FileReader f= new FileReader(inFileName);
            //Scanner scanner = new Scanner(f);
            FileWriter fileWriter = new FileWriter(outFileName);
            char[] b = new char[8096];
            int chars = f.read(b);
            String s= filter.replace(",","' '()-");
            while (chars !=-1){
                System.out.println(String.valueOf(b,0,chars));
                chars= f.read(b);
                //filter = inFileName.substring ("(),' '")+fileWriter;

            }
            f.close();
        }
        catch (IOException e)
        {e.printStackTrace();
        }
        //catch (Exception e){filterFile("C:\\Users\\Боря\\Desktop\\java12.txt");}
    }


    public static void main(String[] args)  {

        filterFile("C:\\Users\\Боря\\Desktop\\java12.txt","C:\\Users\\Боря\\Desktop\\java12.txt","' '()-.");
    }
}
