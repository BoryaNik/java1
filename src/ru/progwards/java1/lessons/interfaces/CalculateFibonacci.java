package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    public static int fiboNumber(int n){ //2.1 функция fiboNumber
        if (lastFibo.n == n) return lastFibo.fibo; // funkciya fiboNumber
                                       //   2.4 staticheskaya peremennaya lastFibo
        int first = 1;
        int next = 1;
        int b;
        int s = 1;
        // while (i++ < n) {
        for(int i=0; i<n;i++){
            b = next;
            next += first;
            first = b;
        }

        lastFibo.n = n;
        lastFibo.fibo = next;
        return next;
    }
    CalculateFibonacci() { lastFibo = new CacheInfo(); }

    static CacheInfo lastFibo;             // 2.3
static { lastFibo = new CacheInfo(); }
    static class CacheInfo{               // 2.2
        int n; // число, для которого рассчитываем Фибоначчи
        int fibo; // результат расчета
        CacheInfo() { n = 1; }
        CacheInfo(int n, int n1) {
            this.n = n;
            this.fibo = n1;
        }
    }

    public static void main(String[] args) {

    }
}

