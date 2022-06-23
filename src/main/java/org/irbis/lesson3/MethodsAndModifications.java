package org.irbis.lesson3;

public class MethodsAndModifications {

    //            (default)
    // public
    // protected
    // private
    public static String printNewLine() {
        String str = "xxxxx";
        System.out.println("Делаю много логики");
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        String result = printNewLine();
        System.out.println(result);
        int sum = sum(10, 23);
        int sum1 = sum(16, 58);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum(1111, 112234));

        minus(100);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
    public static long sum(long x, long y) {
        return x + y;
    }


    public static void minus(int x) {
        if (x != 0) { // ! =
            System.out.println(x);
            minus(--x);
        } else {
            System.out.println("Я всё!");
        }
    }

}
