package com.jrda.algorithms;

import java.util.ArrayList;
import java.util.List;

public class StringHalvesAlike {
	
	public boolean halvesAreAlike(String s) {
		int count = 0;
		
		List<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
        
        String s0 = s.substring(0, s.length()/2);
        String s1 = s.substring(s.length()/2, s.length());
        
        for (int i = 0; i < s.length()/2; i++) {
        	if (vowels.contains(s0.charAt(i))) {
        		count++;
        	}
        	
        	if (vowels.contains(s1.charAt(i))) {
        		count--;
        	}
        }
        
		return count == 0;
    }

}
