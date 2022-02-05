package com.jrda.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapJoiner {
    public <K, V> Map<K, List<V>> join(Map<K, List<V>> m0, Map<K, List<V>> m1) {

        Map<K, List<V>> resultingMap = new HashMap<>(m0);

        for (Map.Entry<K, List<V>> entry : m1.entrySet()) {
            resultingMap.computeIfAbsent(entry.getKey(), k -> new ArrayList<>()).addAll(entry.getValue());
        }

        return resultingMap;
    }
}
