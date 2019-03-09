package com.codekata._04.datamunging;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
	List<String> lines = null;
	String filePath;
	
	public DataReader(String filePath) {
		this.filePath = filePath;
		loadLines();
	}
	
	public int getColumnsNumber() {
		String regex = "\\s+";
		String[] columns = lines.get(0).split(regex);
		return columns.length;
	}
	
	public List<String> getLines() {
		return lines;
	}
	
	public int getNumberOfLines() {
		return lines.size();
	}
	
	private void loadLines() {
		lines = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		    for(String line; (line = br.readLine()) != null; ) {
		    	if(!isEmpty(line.trim())) {
		    		lines.add(line.trim());
		    	}
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private boolean isEmpty(String line) {
		String wLine = line.trim();
		
		return wLine == "" ? true : false;
	}
	
}
