package com.jrda.algorithms.median;

public class ProgressiveMedian {
    private OrderedList orderedList;

    public ProgressiveMedian() {
        orderedList = new OrderedList();
    }

    public double add(int n) {
        orderedList.add(n);

        if (orderedList.getSize() == 1) {
            return orderedList.get(0);
        }

        //size 0 ?
        if (orderedList.getSize() % 2 == 0) {
            //take two central positions
            int positionTwo = orderedList.getSize() / 2;
            return (orderedList.get(positionTwo) + orderedList.get(positionTwo - 1)) / 2d;
        } else {
            //take the central position
            return orderedList.get(orderedList.getSize() / 2);
        }
    }
}
