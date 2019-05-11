package com.codekata._08.conflicting_objectives;

import java.util.List;

public class ComposedWordChecker {
	List<String> diccionary;

	public ComposedWordChecker(List<String> diccionary) {
		this.diccionary = diccionary;
	}
	
	public boolean isComposed(String word) {
		char[] wordChars = word.toCharArray();
		String prefix = "";
		String suffix = "";
		
		for(int i = 0; i < wordChars.length; i++) {
			prefix = prefix + wordChars[i];
			suffix = word.substring(i + 1, wordChars.length);
			if(diccionary.contains(prefix) && diccionary.contains(suffix)) {
				return true;
			}
		}
		return false;
	}

}
