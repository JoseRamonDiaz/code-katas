package com.codekata._13.counting_loc;

import com.codekata._04.datamunging.DataReader;

import java.util.List;

public class LocCounter {

    public int getCount(String fileName){
        DataReader dataReader = new DataReader(fileName);
        List<String> lines = dataReader.getLines();
        LocMatcher locMatcher = new LocMatcher();
        int emptyLines = 0;
        for(String line : lines){
            if(locMatcher.isSingleLineComment(line)) {
                emptyLines++;
            }
        }
        return lines.size() - emptyLines;
    }
}
