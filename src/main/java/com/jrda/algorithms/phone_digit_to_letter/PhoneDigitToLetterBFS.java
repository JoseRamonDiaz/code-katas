package com.jrda.algorithms.phone_digit_to_letter;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class PhoneDigitToLetterBFS {
	private Map<String, List<String>> numberToLetters = Map.of(
			"2", List.of("a", "b", "c"),
			"3", List.of("d", "e", "f"), 
			"4", List.of("g", "h", "i")
			);
	
	
	public List<String> getCombinations(String dialed) {
		if (dialed == null || dialed.isEmpty() || dialed.equals("1"))
			return List.of();
		
		Queue<String> q = new LinkedList<>();
		q.add("");
		String[] dialedNumbers = dialed.split("(?<=.)");

		for (String d : dialedNumbers) {
			int iterations = q.size();
			List<String> letters = numberToLetters.get(d);
			for (int i = 0; i < iterations; i++) {
				String existing = q.poll();
				for (String l : letters) {
					q.add(existing + l);
				}
			}
		}
		
		return q.stream().toList();
	}
}
