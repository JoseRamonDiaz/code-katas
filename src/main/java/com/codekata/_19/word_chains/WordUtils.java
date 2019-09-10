package com.codekata._19.word_chains;

public class WordUtils {

    public int getDiff(String a, String b){
        int diffCounter = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                diffCounter++;
            }
        }
        return diffCounter;
    }

    public boolean isCloserThanCurrent(String currentWord, String comparingWord, String end) {
        return getDiff(currentWord, end) > getDiff(comparingWord, end);
    }

    public boolean isWCloserToEnd(String currentWord, String comparingWord, String end){
        if(currentWord.length() != comparingWord.length()){
            return false;
        }
        boolean differJustByOneChar = getDiff(currentWord, comparingWord) <= 1;
        return differJustByOneChar && isCloserThanCurrent(currentWord, comparingWord, end);
    }
}
