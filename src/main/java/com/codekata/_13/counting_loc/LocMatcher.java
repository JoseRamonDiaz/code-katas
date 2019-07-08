package com.codekata._13.counting_loc;

public class LocMatcher {

    public boolean isSingleLineComment(String line){
        return line.matches("^\\s*\\/\\/.*");
    }

    public boolean isMultilineCommentInLine(String line){
        return line.matches("^\\s*\\/\\*.*\\*\\/\\s*$");
    }

    public boolean isMultilineCommentStart(String line){
        return line.matches("^\\s*\\/\\*.*");
    }

    public boolean isMultilineCommentEnd(String line) {
        return line.matches(".*\\*\\/");
    }
}
