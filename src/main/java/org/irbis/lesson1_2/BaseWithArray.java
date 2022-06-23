package org.irbis.lesson1_2;

public class BaseWithArray {
    public static void main(String[] args) {
        float pi = 3.14F;
        int studentsCount = 6;
        long bigNumber = 100000000000L;
        boolean isEarthFlat = false;
        char a = 'a';
        String name = "Славчик";

        int plusOne = studentsCount + 1;
        int minusTen = studentsCount - 10;
        int divedTwo = studentsCount / 2;
        int multiplyTree = studentsCount * 3;
        boolean isEven = studentsCount % 2 == 0;

        if (!isEarthFlat) {
            System.out.println("Многа студентов");
        } else {
            System.out.println("Никто не пришёл...");
        }

        switch (studentsCount % 2) {
            case 0:
                System.out.println();
                break;
            case 1:
                System.out.println();
                break;
            default:
                System.out.println();
        }

        int count = 0;
        while (count != 10) {
            System.out.println(count);
            count = count + 1;
        }
        System.out.println("Loop end");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        byte[][] twoDimensionArr = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 1, 0}
        };

        for (int i = 0; i < twoDimensionArr.length; i++) {
            for (int j = 0; j < twoDimensionArr[0].length; j++) {
                System.out.print(" "+twoDimensionArr[i][j]);
            }
            System.out.println();
        }
    }
}