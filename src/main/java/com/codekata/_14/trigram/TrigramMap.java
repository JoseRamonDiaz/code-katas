package com.codekata._14.trigram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrigramMap {

    private Map<String, List<String>> trigrams = new HashMap<>();

    public void add(String key, String valueToAdd){
        //exist
        if(trigrams.get(key) != null){
            List<String> values = trigrams.get(key);
            values.add(valueToAdd);
            trigrams.put(key, values);
        }else{//dont exist
            List<String> newValue = new ArrayList<>();
            newValue.add(valueToAdd);
            trigrams.put(key, newValue);
        }
    }

    public List<String> getValuesList(String key){
        return trigrams.get(key);
    }

    public int size(){
        return trigrams.size();
    }

}
