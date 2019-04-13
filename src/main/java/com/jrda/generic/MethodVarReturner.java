package com.jrda.generic;

public class MethodVarReturner {
	
	public <T> T methodToReturnT(VarietyClassesReturner<T> varRetClass) {
		return varRetClass.get();
	}

}
