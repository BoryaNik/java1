package ru.progwards.java1.lessons.bigints;

    public abstract class AbsInteger{
        public static AbsInteger add(AbsInteger num1, AbsInteger num2){
            long n1 = Long.parseLong(num1.toString());
            long n2 = Long.parseLong(num2.toString());
            long res = n1+n2;
            if(res > -128 && res<127)
                return  new ByteInteger((byte)res);
            else
                return new ShortInteger((short) res);

        }


    }

