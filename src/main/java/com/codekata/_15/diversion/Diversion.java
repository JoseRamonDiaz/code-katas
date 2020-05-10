package com.codekata._15.diversion;

import java.util.HashSet;
import java.util.Set;

public class Diversion {

    public Set<String> generateCombinations(int length) throws Exception {
        Set<String> baseCase = new HashSet<>(){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
                add("0");
                add("1");
            }
        };

        if(length <= 0){
            throw new Exception("String length need to be greater than zero");
        }

        if(length == 1){
            return baseCase;
        }

        for(int i = 0; i < length -1; i++){
            baseCase = new SetUtils().duplicateAndAddZerosAndOnes(baseCase);
        }

        return baseCase;
    }

    public int getAdjacentOnes(Set<String> combinations) {
        int adjacent = 0;

        for(String s : combinations){
            if(s.contains("11")){
                adjacent++;
            }
        }

        return adjacent;
    }
}
