package com.codekata._14.trigram;

import com.codekata._04.datamunging.DataReader;

import java.util.List;

public class PairReader {
    DataReader dr;
    TrigramMap trigrams;

    public PairReader(String fileName){
        dr = new DataReader(fileName);
        trigrams = new TrigramMap();
        generateTrigrams(dr.getLines());
    }

    public int getPairsCount(){
        return trigrams.size();
    }

    private void generateTrigrams(List<String> lines) {
        for(String line : lines){
            String[] words = line.split(" ");

            for(int i = 0; i < words.length - 2; i++){
                trigrams.add(words[i].toLowerCase() + " " + words[i + 1].toLowerCase(), words[i + 2]);
            }
        }
    }

}
