package com.codekata._15.diversion;

import java.util.HashSet;
import java.util.Set;

public class Diversion {
    private Set<String> baseCase = new HashSet<>(){
        {
            add("0");
            add("1");
        }
    };

    public Set<String> generateCombinations(int length) throws Exception {

        if(length <= 0){
            throw new Exception("String length need to be greatter than zero");
        }

        if(length == 1){
            return baseCase;
        }

        for(int i = 0; i < length -1; i++){
            baseCase = new ArrayUtils().duplicateAndAddZerosAndOnes(baseCase);
        }

        return baseCase;
    }
}
