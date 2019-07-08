package com.codekata._13.counting_loc;

import com.codekata._04.datamunging.DataReader;

import java.util.List;

public class LocCounter {

    public int getCount(String fileName){
        DataReader dataReader = new DataReader(fileName);
        List<String> lines = dataReader.getLines();
        LocMatcher locMatcher = new LocMatcher();
        int emptyLines = 0;
        boolean multilineComment = false;

        for(String line : lines){
            if(multilineComment){
                if(locMatcher.isMultilineCommentEnd(line)){
                    emptyLines++;
                    multilineComment = false;
                }else{
                    emptyLines++;
                    continue;
                }
            }

            if(locMatcher.isSingleLineComment(line) || locMatcher.isMultilineCommentInLine(line)) {
                emptyLines++;
                continue;
            }

            if(locMatcher.isMultilineCommentStart(line)){
                emptyLines++;
                multilineComment = true;
            }
        }
        return lines.size() - emptyLines;
    }
}
