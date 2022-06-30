package org.irbis.lesson6;

import java.util.*;

public class CollectionAndStringsMain {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("asd0");
        arrayList.add("asd1");
        arrayList.add("asd2");

//        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(2));
        List<String> linkedList = new LinkedList<>();
        linkedList.add("123");
        linkedList.add("345");
        arrayList.addAll(linkedList);

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        Set<String> hashSet = new HashSet<>();
        hashSet.add("123");
        hashSet.add("234");
        hashSet.add("234");
        hashSet.add("234");
        hashSet.add("456");
        hashSet.add("567");
        hashSet.add("678");
//        for (String str : hashSet) {
//            System.out.println(str);
//        }

        Map<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("user_count", 123);
        stringIntegerHashMap.put("clients_count", 324);
        stringIntegerHashMap.put("admins_count", 456);
        stringIntegerHashMap.put("zxcvbc", 678);

        Integer asd = stringIntegerHashMap.get("user_count");

        for (Map.Entry<String, Integer> entry : stringIntegerHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }


        int indexOf = "asdfasdf".indexOf("f"); //lastIndexOf
        String lowerCase = "adsfsadf".toLowerCase(); //toUpperCase
        boolean empty = "asdfasdf".isEmpty(); //isBlank
        String substring1 = "asdfsadf".substring(4);//sadf
        String substring = "asdfsadf".substring(indexOf, 6);//sa
        boolean r_с = "R_C_asdfadsf".startsWith("R_С");//endsWith
        String[] s = "asdf asd asdf".split(" "); //[asdf,asd,asdf]
        String strip = "   asdfasdf ".strip(); // "asdfasdf"
        String replace = "asdfas".replace("sd", "123"); //a123fas
        String replaceAll = "adfasadf".replaceAll("ad", "123"); //123fas123f

    }
}
