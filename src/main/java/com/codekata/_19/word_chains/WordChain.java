package com.codekata._19.word_chains;

import com.codekata._04.datamunging.DataReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordChain {
    WordUtils wordUtils;
    private String diccionaryFilePath = "wordlist.txt";
    private List<String> diccionary;

    public WordChain(){
        wordUtils = new WordUtils();
        diccionary = new DataReader(diccionaryFilePath).getLines();
    }

    public List<String> getDiccionary() {
        return diccionary;
    }

    public List<String> getShortestWordChain(String start, String end) {
        if(start.length() != end.length() || start.equals(end)){
            return Collections.emptyList();
        }

        reduceDiccionaryToUsefulEntries(start.length());
        List<String> wordChain = new ArrayList<>(Arrays.asList(start));
        String currentComparingWord = start;

        for(String w : diccionary){
            if(wordUtils.isWCloserToEnd(currentComparingWord, w, end)){
                if(wordUtils.getDiff(w, end) > 1) {
                    //if is not the end word
                    currentComparingWord = w;
                    wordChain.add(w);
                } else {
                    //if is the end word
                    wordChain.add(w);
                    wordChain.add(end);
                    return wordChain;
                }
            }
        }
        return Collections.emptyList();
    }

    //we don't need entries with different lenght to the start word
    private void reduceDiccionaryToUsefulEntries(int length){
        for(int i = 0; i < diccionary.size(); i++){
            if(diccionary.get(i).length() != length){
                diccionary.remove(i);
            }
        }
    }
}
