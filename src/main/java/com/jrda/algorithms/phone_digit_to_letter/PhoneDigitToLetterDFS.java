package com.jrda.algorithms.phone_digit_to_letter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PhoneDigitToLetterDFS {
	private Map<String, List<String>> numberToLetters = Map.of(
			"2",  List.of("a", "b", "c"),
			"3",   List.of("d", "e", "f"), 
			"4", List.of("g", "h", "i")
			);
	
	public List<String> getCombinations(String dialed) {
		if (dialed == null || dialed.isEmpty() || dialed.equals("1"))
			return List.of();
		
		String[] dialedNumbers = dialed.split("(?<=.)");
		return getCombinations(dialedNumbers);
	}
	
	private List<String> getCombinations(String[] dialedDigits) {
		List<String> comb = new ArrayList<>();
		
		if (dialedDigits.length == 1)
			return numberToLetters.get(dialedDigits[0]);
		
		String digit = dialedDigits[0];
		
		for (String letter : numberToLetters.get(digit)) {
			for (String singleComb : getCombinations(Arrays.copyOfRange(dialedDigits, 1, dialedDigits.length))) {
			comb.add(letter + singleComb);
			}
		}
		
		return comb;
	}
}
