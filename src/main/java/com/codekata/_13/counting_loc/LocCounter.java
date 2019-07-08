package com.codekata._13.counting_loc;

import com.codekata._04.datamunging.DataReader;

import java.util.List;

public class LocCounter {
    int emptyLines = 0;
    boolean multilineComment = false;
    LocMatcher locMatcher = new LocMatcher();

    public int getCount(String fileName){
        DataReader dataReader = new DataReader(fileName);
        List<String> lines = dataReader.getLines();

        for(String line : lines){
            if(multilineComment){
                countMultilineCommentLines(line);
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

    private void countMultilineCommentLines(String line) {
        if(locMatcher.isMultilineCommentEnd(line)){
            emptyLines++;
            multilineComment = false;
        }else{
            emptyLines++;
        }
    }
}
