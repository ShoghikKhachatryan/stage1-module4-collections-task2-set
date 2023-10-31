package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> temp = new HashSet<>();

        for (Integer i : sourceList) {
            if (isOdd(i)) {
                temp.add(i);
                temp.add(i * 2);
            } else {
                do {
                    temp.add(i);
                    i /= 2;
                } while (i % 2 == 0);
                temp.add(i);
            }
        }

        return temp;
    }

    private boolean isOdd(Integer num) {
        return (0 != num % 2);
    }
}
