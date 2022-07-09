package com.jrda.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MinimumWindowSubstring {
	private String minWindow = "";
	
	 public String minWindow(String s, String t) {
		 int leftPointer = 0;
		 int rightPointer = 0;
		 
		 String currentWindow = "";
		 while (leftPointer <= rightPointer && rightPointer < s.length()) {
			 currentWindow = s.substring(leftPointer, rightPointer + 1);
			 if (contains(currentWindow, t)) {
				 leftPointer++;
			 } else { 
				 rightPointer++;
			 }
		 }
		 
		 return minWindow;
	 }

	private boolean contains(String currentWindow, String t) {
		Map<Character, Integer> currentMap = getRepetitionMap(currentWindow);
		Map<Character, Integer> tMap = getRepetitionMap(t);
		
		for (Entry<Character, Integer> e : tMap.entrySet()) {
			if (currentMap.get(e.getKey()) == null || currentMap.get(e.getKey()) < e.getValue()) {
				return false;
			}
		}
		
		if (minWindow.isEmpty() || minWindow.length() > currentWindow.length())
			minWindow = currentWindow;
       
		return true;
	}

	private Map<Character, Integer> getRepetitionMap(String string) {
		Map<Character, Integer> repetitionMap = new HashMap<>();
		
		for(char c : string.toCharArray()) {
			repetitionMap.computeIfAbsent(c, k -> 0);
			repetitionMap.put(c, repetitionMap.get(c) + 1);
		}
		
		return repetitionMap;
	}
}
