package Test_2;

import org.w3c.dom.ls.LSOutput;

public class Test_2 {
    static void println(String str){
        System.out.println(str);
    }
    static int addituon(int x, int y){
        return x+y;
    }
    public static void  main(String[] args){
        println("Привет, мир!");
        println("Мир, ты слышишь меня?!");
        System.out.print("Я знаю что 5 + 7 = ");
        System.out.println(addituon(5,7));
    }
}
