package com.codekata._06.anagrams;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.codekata._04.datamunging.DataReader;

public class FileAnagramsChecker {
	private int anagramsSets = 0;
	private DataReader dataReader;
	private List<String> wordsList;
	private long wordPerSecond = 0;
	private long startTime = 0;
	private boolean[] tachados;
	
	public FileAnagramsChecker() {
		System.out.println("reading file...");
		dataReader = new DataReader("wordlist.txt");
		System.out.println("finished reading file...");
		wordsList = dataReader.getLines();
		tachados = new boolean[wordsList.size()];
		checkAnagrams();
		System.out.println("finished checking anagrams");
	}
	
	private void checkAnagrams() {
		startTime = System.currentTimeMillis();
		int wordsListSize = wordsList.size();
		Map<Character, Integer>[] mapArray = new HashMap[wordsListSize];
		System.out.println("Generating map...");
		for(int i = 0; i < wordsListSize; i++) {
			mapArray[i] = frequencyMap(wordsList.get(i));
		}
		System.out.println("finished generating map...");
		
		for(int i = 0; i < wordsListSize; i++) {
			System.out.println("checking " + i);
			boolean isAnagram = false;
			if(!tachados[i]) {
				for(int j = i + 1; j < wordsListSize; j++ ) {
					
//					for(Character miChar : mapArray[i].keySet()) {
//						if(mapArray[i].get(miChar) != mapArray[j].get(miChar)) {
//							isAnagram = false;
//							break;
//						}
//						isAnagram = true;
//					}
					
						if(mapArray[i].equals(mapArray[j])) {
							tachados[j] = true;
							isAnagram = true;
						}
					
				}
				if(isAnagram) {
					anagramsSets++;
				}
			}
			wordPerSecond =  (i / ((System.currentTimeMillis()-startTime) / 1000)); 
			System.out.println("palabras por segundo " + wordPerSecond);
		}
		
	}
	
	private static Map<Character, Integer> frequencyMap(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : str.toLowerCase().toCharArray()) {
            Integer frequency = map.get(c);
            map.put(c, frequency == null ? 1 : frequency+1);
        }
        return map;
    }
	
	public int getAnagramsSets() {
		return anagramsSets;
	}

}
