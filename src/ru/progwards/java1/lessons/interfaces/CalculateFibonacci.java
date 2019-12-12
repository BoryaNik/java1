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
        if (lastFibo.n == n) return lastFibo.fibo; // funkciya fiboNumber
        //   2.4 staticheskaya peremennaya lastFibo
        int first = 0;
        int next = 1;
        int b;
        int s = 1;
         while (s++ < n) {
        //(int i=0; i<n;i++){
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

    }
}

