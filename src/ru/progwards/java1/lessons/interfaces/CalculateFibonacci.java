package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    static CacheInfo lastFibo;  // 2.3 staticheskaya peremennaya

    static { lastFibo = new CacheInfo(); }

    static class CacheInfo {    // 2.2 vlogenniy class

        int n; //число, для которого рассчитываем Фибоначчи
        int fibo; //  rezultat  rascheta

        CacheInfo() { n = -1; }

        CacheInfo(int n, int n1) {
            this.n = n;
            this.fibo = n1;
        }
    }
    public static int fiboNumber(int n) {    //  2.1 iz zadachi 3 uroka 3 funkciya

        lastFibo.n= -1;
        //lastFibo.fibo =0;       // iz primera

         if (lastFibo.n == n) return lastFibo.fibo; // funkciya fiboNumber

        int first = 0;
        int next = 1;
        int b;
        int s = 1;
         while (s++ < n) {
            b = next;
            next += first;
            first = b;
        }

        lastFibo.n = n;
        lastFibo.fibo = next;
        return next;
    }

    CalculateFibonacci() { lastFibo = new CacheInfo(); }

   public static CacheInfo getLastFibo(){
        return lastFibo;
    }
   public static void clearLastFibo(){

        lastFibo = null;
    }

    public static void main(String[] args) {

        //System.out.println(lastFibo.fibo);
    }
}

