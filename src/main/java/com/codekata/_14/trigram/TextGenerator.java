package com.codekata._14.trigram;

public class TextGenerator {
	public String getText(String key, int numberOfIterations) {
		String text = key;
		PairReader pr = new PairReader("trigrams");
		TrigramMap trigrams = pr.getTrigrams();
		String last = key.split(" ")[1];
		String penultimate = key.split(" ")[0];
		
		for(int i = 0; i < numberOfIterations; i++) {
			String oldLast = last;
			last = trigrams.get(penultimate + " " + last);
			text = text.concat(" " + last);
			penultimate = oldLast;
		}
		
		return text;
	}
}
