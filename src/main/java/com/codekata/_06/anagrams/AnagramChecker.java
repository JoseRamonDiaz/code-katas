package com.codekata._06.anagrams;

public class AnagramChecker {

	public static boolean areAnagrams(String str1, String str2) {
		boolean areAnagrams = false;
		if(str1.length() != str2.length()) {
			return areAnagrams;
		}
		
		boolean[] tachados = new boolean[str2.length()]; 
		
		for(int j = 0; j < str1.length(); j++) {
			char c = str1.charAt(j);
			boolean existChar = false;
			
			for(int i = 0; i < str2.length(); i++) {
				if(!tachados[i]) {
					if(c == str2.charAt(i)) {
						tachados[i] = true;
						existChar = true;
						break;
					}else {
						continue;
					}
				}
			}
			if(!existChar) {
				return false;
			}
		}
		areAnagrams = todosTachados(tachados);
		return areAnagrams;
	}
	
	private static boolean todosTachados(boolean[] tachados) {
		boolean todosTachados = true;
		for(boolean tachado : tachados) {
			if(!tachado) {
				return false;
			}
		}
		return todosTachados;
	}
	
	public static boolean areAnagramsBySum(String str1, String str2) {
		boolean areAnagrams = false;
		
		
		
		return areAnagrams;
	}
	
}
