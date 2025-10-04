package com.jrda.algorithms.flute_state;

import java.util.ArrayList;
import java.util.List;

public class FluteStateDFS {
	private List<String> states = List.of("0", "1");
	
	public List<String> getFluteStates(int fluteSize) {
		if (fluteSize <= 0)
			return List.of();
		
		if (fluteSize == 1) 
			return states;

		List<String> result = new ArrayList<>();
		
		for (String s : states) {
			for (String comb : getFluteStates(fluteSize - 1)) {
				result.add(s + comb);
			}
		}
		
		return result;
	}
}
