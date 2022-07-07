package org.irbis.lesson7.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>(123);
        Box<Double> dbox = new Box<>(123.0);

        System.out.println(ibox.value);
        System.out.println(dbox.value);

        print(ibox.value);
        print(dbox.value);
        print(new ArrayList<>());
        print(new HashMap<>());

        print1(List.of(new IndexOutOfBoundsException()));
    }

    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static void print1(List<? extends RuntimeException> list) {
        System.out.println(list);
    }

}
