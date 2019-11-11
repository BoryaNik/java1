package Progwards.HelloWorld;

public class Task3 {
    public static int addition(int x, int y) {
        return x + y;
        //System.out.println("Вызвана функция addition()");
    }
    public static int subtraction(int x, int y){
        return x-y;
    }
    public static int multiplication(int x, int y){
        return x*y;
    }
    public static void main(String[] args) {
        int a= 34;
        int b= 55;
        int c;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("Вызвана функция addition()");
        System.out.println("a + b = "+addition(a,b) );
        System.out.println("Вызвана функция subtraction()");
        System.out.println("a - b = "+ subtraction(a,b));
        System.out.println("Вызвана функция multiplication()");
        System.out.println("a * b = " + multiplication(a,b));
    }
}
