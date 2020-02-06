package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;

public class StackCalc {


        private ArrayDeque<Double> queue = new ArrayDeque<Double>();

        public void push(double value) {
            queue.offerLast(value);
        }

        public double pop() {
            return queue.pollLast();
        }

        public void add() {
            if (queue.size() < 2) return;
            queue.offerLast(queue.pollLast() + queue.pollLast());
        }

        public void sub() {
            if (queue.size() < 2) return;
            queue.offerLast(-queue.pollLast() + queue.pollLast());
        }

        public void mul() {
            if (queue.size() < 2) return;
            queue.offerLast(queue.pollLast() * queue.pollLast());
        }

        public void div() {
            if (queue.size() < 2) return;
            Double e1 = queue.pollLast();
            queue.offerLast(queue.pollLast() / e1);
        }
    }
    class Calculate {

        public static double calculation1() {
            StackCalc c = new StackCalc();
            c.push(2.2);
            c.push(3);
            c.push(12.1);
            c.add();
            c.mul();
            return c.pop();
        }

        public static double calculation2() {
            StackCalc c = new StackCalc();
            c.push(737.22);
            c.push(24);
            c.add();
            c.push(55.6);
            c.push(12.1);
            c.sub();
            c.div(); // (737.22+24)/(55.6-12.1)+
            c.push(19);
            c.push(3.33);
            c.sub(); // (19-3.33)*(
            c.push(87);
            c.push(2);
            c.push(13.001);
            c.push(9.2);
            c.sub();
            c.mul();
            c.add(); // 87+2*(13.001-9.2)
            c.mul();
            c.add();
            return c.pop();
        }

        public static void main(String[] args) {
            System.out.println(calculation1());
            System.out.println(calculation2());
        }
    }

