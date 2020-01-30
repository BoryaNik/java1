package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

        public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
            Set<Integer>unionSet = new TreeSet<Integer>();
            for(Integer currentElement : set1){
                unionSet.add(currentElement);
            }
            for (Integer currentElement : set2){
                unionSet.add(currentElement);
            }
            return unionSet;


        }
        public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
            Set<Integer>intersectionSet = new TreeSet<Integer>();
            for(Integer set1SetElement : set1){
                for(Integer set2SetElement : set2){
                    if(set1SetElement==set2SetElement){
                        intersectionSet.add(set1SetElement);
                    }
                }
            }
            return intersectionSet;
        }
        public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2){
            if (set1 == null) return new HashSet<Integer>();
            Set<Integer> result = new HashSet<Integer>(set1);
            if (set2 != null) result.removeAll(set2);
            return result;
        }
        public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
            Set<Integer> symDifferenceSet = new TreeSet<Integer>(set1);
            symDifferenceSet .addAll(set2);
            Set<Integer> tmp = new HashSet<Integer>(set1);
            tmp.retainAll(set2);
            symDifferenceSet .removeAll(tmp);
            return symDifferenceSet;
        }

    public static void main(String[] args) {

    }

    }

