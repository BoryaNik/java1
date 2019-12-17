package ru.progwards.java1.lessons.bigints;

    public abstract class AbsInteger {
        int n;


        static AbsInteger add(AbsInteger num1, AbsInteger num2) {
            return (add(num1, num2));
        }

        public static void main(String[] args) {
        }

        public class ByteInteger extends AbsInteger {
            byte a;

            ByteInteger(byte a) {
                this.a = a;
                n = 1;

            }

            @Override
            public String toString() {
                return Byte.toString(a);
            }


        }
        public class IntInteger extends AbsInteger {
            int b;
            IntInteger(int b){
                this.b=b;
                b=100;
            }
            @Override
            public String toString(){
                return Integer.toString(b);}
        }
        public class ShortInteger extends AbsInteger {
            short s;

            ShortInteger(short s){
                this.s=s;
                s=1;
            }
            @Override
            public String toString(){
                return Integer.toString(s);}
        }
    }

