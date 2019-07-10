package com.codekata._14.trigram;

import com.codekata._04.datamunging.DataReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairReader {
    DataReader dr = new DataReader("trigrams");
    TrigramMap trigrams = new TrigramMap();

    public int getPairsCount(){
        List<String> lines = dr.getLines();

        for(String line : lines){
            String[] words = line.split(" ");
            generateTrigrams(words);
        }

        return trigrams.size();
    }

    private void generateTrigrams(String[] words) {
        for(int i = 0; i < words.length - 2; i++){
            trigrams.add(words[i].toLowerCase() + " " + words[i + 1].toLowerCase(), words[i + 2]);
        }
    }

}
