package com.codekata._18.transitive_dependencies;

import java.util.*;

public class TransitiveDependencies {
    Map<String, String[]> map = new HashMap<>();
    Set<String> dependenciesSet = new HashSet<>();
    Set<String> usedKeys = new HashSet<>();

    public void addDirect(String c, String[] strings) {
        map.put(c, strings);
    }

    public Set<String> getDependencies(String c){
        String[] tempArray = map.get(c);
        if((tempArray != null) && (!usedKeys.contains(c))){
            usedKeys.add(c);
            for(String s : tempArray){
                dependenciesSet.add(s);
            }

            for(String s : tempArray){
                getDependencies(s);
            }
        }

        return dependenciesSet;
    }
}
