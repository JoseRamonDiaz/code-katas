package com.codekata._13.counting_loc;

public class LocMatcher {

    public boolean isSingleLineComment(String line){
        return line.matches("^\\/\\/.*");
    }

    public boolean isMultilineCommentStart(String line){
        return line.matches("\\/\\*.*\\*\\/");
    }
}
