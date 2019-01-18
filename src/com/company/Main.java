package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    // write your code here
    //Есть коллекция элементов String. Вам нужно сортировать эту коллекцию по длине строки. Используйте Collections.sort(List<T> list, Comparator<? super T> cmp)
    //Collections.sort(List<T> list, Comparator<? super T> cmp)

    // You need to implement LengthComparator implements Comparator
    public static void test(){
        List<String> s = Arrays.asList("aaa", "b", "cd");
        // Should return {b, cd , aaa}
        Collections.sort(s, new LengthComparator());
    }
}