package com.jrda.generic;

public class VarietyClassesReturner<T> {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
