package com.codekata._15.diversion;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    List<String> duplicatedArrayList = new ArrayList<>();

    public List<String> duplicateAndAddZerosAndOnes(List<String> strings) {
        for(String entry : strings){
            duplicatedArrayList.add(entry + "0");
            duplicatedArrayList.add(entry + "1");
        }
        return duplicatedArrayList;
    }


}
