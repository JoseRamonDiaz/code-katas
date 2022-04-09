package com.jrda.algorithms.minimum_window_substring;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty())
            return "";

        //t map & count
        Map<Character, Integer> tCountMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int count = tCountMap.getOrDefault(t.charAt(i), 0);
            tCountMap.put(t.charAt(i), ++count);
        }

        //window count
        Map<Character, Integer> windowCountMap = new HashMap<>();

        int required = tCountMap.size();
        int l = 0, r = 0;
        int formed = 0;
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            char c = s.charAt(r);
            int count = windowCountMap.getOrDefault(c, 0);
            windowCountMap.put(c, ++count);

            if (tCountMap.containsKey(c) && tCountMap.get(c).intValue() == windowCountMap.get(c).intValue())
                formed++;

            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (ans[0] == -1 || ans[0] > r - l + 1) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                windowCountMap.put(c, windowCountMap.get(c) - 1);
                if (tCountMap.containsKey(c) && windowCountMap.get(c).intValue() < tCountMap.get(c).intValue())
                    formed--;

                l++;
            }
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
