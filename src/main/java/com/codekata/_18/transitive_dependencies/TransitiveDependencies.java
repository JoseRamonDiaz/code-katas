package com.codekata._18.transitive_dependencies;

import java.util.*;

public class TransitiveDependencies {
    Map<String, String[]> map = new HashMap<>();
    Set<String> dependenciesSet = new HashSet<>();

    public void addDirect(String c, String[] strings) {
        map.put(c, strings);
    }

    public String[] getDependencies(String c) {
        if(map.get(c) == null){
            return null;
        }

        for(String dependency : map.get(c)){
            getDependencies(dependency);
        }

        return null;
    }
}
