package org.irbis.lesson7.generic;

public class GenericMain {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>(123);
        Box<Double> dbox = new Box<>(123.0);

        System.out.println(ibox.value);
        System.out.println(dbox.value);
    }
}
