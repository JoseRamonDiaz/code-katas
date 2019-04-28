package com.cleancode.oo;

import java.util.Collections;
import java.util.List;

public class UsersHandle {
	public List<String> getUsersNames(String area){
		if(area == null) {
			throw new RuntimeException("Area can't be null");
		}
		List<String> usersNames = null;
		usersNames = getUsersNamesI();
		if(usersNames == null) {
			return Collections.emptyList();
		}
		return usersNames;
	}
	
	private List<String> getUsersNamesI(){
		return null;
	}
}
