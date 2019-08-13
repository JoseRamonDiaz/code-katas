package com.codekata._18.transitive_dependencies;

import java.util.HashMap;
import java.util.Map;

public class TransitiveDependencies {
    Map<String, String[]> map = new HashMap<>();

    public void addDirect(String c, String[] strings) {
        map.put(c, strings);
    }

    public String[] getDependencies(String c) {
        return map.get(c);
    }
}
