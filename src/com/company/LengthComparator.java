package com.company;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class LengthComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int i1 = o1.toString().length();
        int i2 = o2.toString().length();
        return i1-i2;
    }
}