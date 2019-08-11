package com.codekata._15.diversion;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {
    private Set<String> duplicatedArrayList = new HashSet<>();

    public Set<String> duplicateAndAddZerosAndOnes(Set<String> strings) {
        for(String entry : strings){
            duplicatedArrayList.add(entry + "0");
            duplicatedArrayList.add(entry + "1");
        }
        return duplicatedArrayList;
    }

}
