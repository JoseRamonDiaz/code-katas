package com.jrda.algorithms.median;

import java.util.ArrayList;
import java.util.List;

public class OrderedList {
    private List<Integer> list;

    public OrderedList() {
        list = new ArrayList<>();
    }

    //this can be improved with binary search
    public void add(int n) {
        if (list.isEmpty()) {
            list.add(n);
        }

        for (int i = 0; i < list.size(); i++) {
            if (n < list.get(i)) {
                list.add(i, n);
                break;
            }
        }

        //list doesn't contain repeated values, if value is not present should be the highest value now, just add it
        if (!list.contains(n)) {
            list.add(n);
        }
    }

    public int get(int i) {
        return list.get(i);
    }

    protected List<Integer> getList() {
        return list;
    }

    public int getSize() {
        return list.size();
    }
}
