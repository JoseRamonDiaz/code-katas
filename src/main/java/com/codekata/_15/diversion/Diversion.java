package com.codekata._15.diversion;

import java.util.ArrayList;
import java.util.List;

public class Diversion {
    private List<String> baseCase = new ArrayList<String>(){
        {
            add("0");
            add("1");
        }
    };

    public List<String> generateCombinations(int length) throws Exception {

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
