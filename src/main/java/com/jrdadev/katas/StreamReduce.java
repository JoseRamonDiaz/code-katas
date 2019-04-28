package com.jrdadev.katas;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {
	public int sumIntegers(List<Integer> loi) {
		return loi.stream().reduce(0, (i, j) -> i + j);
	}
	
	public List<String> transform(List<String> list){
		return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	
	public List<String> filterLessThanFourChar(List<String> list){
		return list.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
	}
}
