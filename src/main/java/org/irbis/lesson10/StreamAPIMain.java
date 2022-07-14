package org.irbis.lesson10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIMain {

    public static void main(String[] args) {
        List<Integer> list = List.of(5, 67, 8, 1, 2, 3, 4);

        IntStream arrayStream = Arrays.stream(new int[]{1, 2, 3, 4});
        var set = list
                .stream()
                .filter((i) -> i % 2 == 0)
                .map((i) -> i + " number "+i)
                .flatMap(s -> Stream.of("123", "asdf", "sdfg"))
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());
        //other terminal operators:
//        .max((s1,s2) -> s1.length() - s2.length())
//        .reduce((s1,s2) -> " "+s1+s2);
//                .forEach(s -> System.out.println(s));
//                .count();

        System.out.println(set);

        Set<String> set1 = new HashSet<>();
        for (Integer integer : list) {
            if (integer % 2 != 0)
                continue;

            set1.add(integer + " number");
        }
        // sort set1...
    }
}
