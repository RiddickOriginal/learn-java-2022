package org.irbis.lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamAndLambdaMain {

    public static void main(String[] args) {
        try (Test t = new Test()) {

        } catch (Exception e) {}

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("1234124");
            }
        };
        runnable.run();
        Runnable runnable1 = () -> System.out.println("1234124");

        List<Integer> integerList = List.of(10, 2, 13, 5, 11, 9);
        List<Integer> filterTwo = filter(
                integerList,
                new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer x) {
                        return x % 2 == 0;
                    }
                });

        List<Integer> filterThree = filter(integerList, (x) -> x % 3 == 0);

        Predicate<Integer> dividesThree = (x) -> x % 3 == 0;
        List<Integer> filterThree1 = filter(integerList, dividesThree);

        System.out.println(filterTwo);
        System.out.println(filterThree);

        Contains contains = (str) -> str.contains("a");
    }

    private static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> integers = new ArrayList<>();
        for (Integer integer : list) {
            if (predicate.test(integer))
                integers.add(integer);
        }
        return integers;
    }
}
