package com.jrda.algorithms.rgb_array;

public class RGBArray {
    public String[] sort(String[] strings) {
        int rPointer = -1;
        int bPointer = strings.length;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == "r") {
                String aux = strings[i];
                strings[i] = strings[rPointer + 1];
                strings[rPointer + 1] = aux;
                rPointer++;
            }

            if (strings[i].equals("b")) {
                String aux = strings[i];
                for (int j = bPointer; j > rPointer; j--) {
                    if (aux.equals(strings[bPointer - 1])) {
                        bPointer--;
                    } else {
                        break;
                    }
                }
                strings[i] = strings[bPointer - 1];
                strings[bPointer - 1] = aux;
                bPointer--;
                if (i + 1 == bPointer) {
                    i--;
                }
            }

            if (i + 1 == bPointer) {
                break;
            }
        }

        return strings;
    }
}
