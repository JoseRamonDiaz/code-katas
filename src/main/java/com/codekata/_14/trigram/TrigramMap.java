package com.codekata._14.trigram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrigramMap {

    private Map<String, List<String>> trigrams = new HashMap<>();

    public void add(String key, String valueToAdd){
        boolean keyAlreadyExist = trigrams.get(key) != null;

        if(keyAlreadyExist){
            addToList(key, valueToAdd);
        }else{
            createList(key, valueToAdd);
        }
    }

    private void createList(String key, String valueToAdd) {
        List<String> newValue = new ArrayList<>();
        newValue.add(valueToAdd);
        trigrams.put(key, newValue);
    }

    private void addToList(String key, String valueToAdd) {
        List<String> values = trigrams.get(key);
        values.add(valueToAdd);
        trigrams.put(key, values);
    }

    public List<String> getValuesList(String key){
        return trigrams.get(key);
    }

    public int size(){
        return trigrams.size();
    }

}
