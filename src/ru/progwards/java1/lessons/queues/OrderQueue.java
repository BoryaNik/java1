package ru.progwards.java1.lessons.queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderQueue {
    Comparator<Order> orderComparator = new Comparator<Order>() {
        @Override
        public int compare(Order c1, Order c2) {
            int cl1 = ((int) c1.getSum() - 1) / 10000 + 1;
            if (cl1 < 1) cl1 = 1;
            else if (cl1 > 3) cl1 = 3;
            int cl2 = ((int) c2.getSum() - 1) / 10000 + 1;
            if (cl2 < 1) cl2 = 1;
            else if (cl2 > 3) cl2 = 3;
            if (cl1 == cl2) return c1.getNum() - c2.getNum();
            return cl2 - cl1;
        }
    };

    PriorityQueue<Order> queue = new PriorityQueue<Order>(16, orderComparator);

    public void add(Order order) {
        queue.add(order);
    }

    public Order get() {
        return queue.poll();
    }

    public Order getNum() {
        return queue.poll();
    }

}
class Order{
    static int num1 = 1;
    private double sum;
    private int num;

    public Order(double sum) {
        this.sum = sum;
        this.num = num1++;
    }

    public double getSum() {
        return sum;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return sum + "(" + num + ")";
    }
    public static void main(String[] args) {

    }
}
