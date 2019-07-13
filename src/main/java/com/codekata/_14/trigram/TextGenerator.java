package com.codekata._14.trigram;

public class TextGenerator {
	public String getText(String key, int numberOfIterations) {
		String text = key;
		PairReader pr = new PairReader("trigrams");
		TrigramMap trigrams = pr.getTrigrams();
		
		for(int i = 0; i < numberOfIterations; i++) {
			text = text.concat(" " + trigrams.get(key));
		}
		
		return text;
	}
}
