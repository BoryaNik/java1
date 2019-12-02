package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
     static int sumBits(byte value){
         int result = 0;
         if ((value & 1) == 1) result++;
         value >>= 1;
         if ((value & 1) == 1) result++;
         value >>= 1;
         if ((value & 1) == 1) result++;
         value >>= 1;
         if ((value & 1) == 1) result++;
         value >>= 1;
         if ((value & 1) == 1) result++;
         value >>= 1;
         if ((value & 1) == 1) result++;
         value >>= 1;
         if ((value & 1) == 1) result++;
         value >>= 1;
         if ((value & 1) == 1) result++;
         return result;
     }

    public static void main (String[]args){
        System.out.println(sumBits( (byte)0b100101));
    }
}
