package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsSort {

        public static void mySort(Collection<Integer> data){
            Iterator<Integer> num = data.iterator();
            int idx1 = 0;
            while (num.hasNext()) {
                Integer num1 = num.next();
                Iterator<Integer> it2 = data.iterator();
                Integer num2;
                for (int i = idx1; i >= 0; i--) it2.next();
                int idx2 = idx1 + 1;
                while (it2.hasNext()) {
                    num2 = it2.next();
                    if (num1.compareTo(num2) > 0) {
                        Collections.swap((List)data, idx1, idx2);
                        num1 = num2;
                    }
                    idx2++;
                }
                idx1++;
            }
        }
        public static void minSort(Collection<Integer> data) {

            ArrayList<Integer> list = new ArrayList(data);
            ArrayList<Integer> result = new ArrayList(data.size());

            while (list.size() > 0) {
                Integer min = Collections.min(list);
                result.add(min);
                list.remove(min);
            }

            data.clear();
            data.addAll(result);
        }
        public static void collSort(Collection<Integer> data){

            Collections.sort((List)data);
        }

        public static void randomFill(Integer[] a, int from, int to) {
            for (int i = a.length - 1; i >= 0; i--) a[i] = (int) (Math.random() * (to - from)) + from;
        }
        public static Collection<String> compareSort() {

            for (int cnt = 1; cnt <= 10; cnt++) {
                Integer[] a1 = new Integer[100];
                randomFill(a1, 100, -100);
                Integer[] b1 = new Integer[50_000];
                randomFill(b1, 50_000, -50_000);
                Integer[] c1 = new Integer[100_000];
                randomFill(c1, 100_000, -100_000);
                int aCnt = 10000;
                int bCnt = 3;
                int cCnt = 1;
                long time0 = System.currentTimeMillis();
                for (int i = aCnt; i > 0; i--) {
                    ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(a1));
                    collSort(l);
                }
                long time1 = System.currentTimeMillis();
                for (int i = bCnt; i > 0; i--) {
                    ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(b1));
                    collSort(l);
                }
                long time2 = System.currentTimeMillis();
                for (int i = cCnt; i > 0; i--) {
                    ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(c1));
                    collSort(l);
                }
                long time3 = System.currentTimeMillis();
                System.out.println((time1 - time0) + " " + (time2 - time1) + " " + (time3 - time2));
            }
            return null;
        }

        public static void main(String[] args) {
            System.out.println(compareSort());

        }
}
