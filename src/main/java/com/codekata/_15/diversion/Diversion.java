package com.codekata._15.diversion;

import java.util.Arrays;

public class Diversion {
    private String binaryString;
    private int digits;
    private String[] combinations;

    public Diversion(String binStr, int digits){
        binaryString = binStr;
        this.digits = digits;
        combinations = getCombinations();
    }

    public int getCombinationsNumber(){
       return combinations.length;
    }

    private String[] getCombinations(){
        return binaryString.split("(?<=\\G.{"+ digits +"})");
    }

}
