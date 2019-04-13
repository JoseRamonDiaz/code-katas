package com.jrda.generic;

public class MyInterfaceImpl<T> extends FuncionesAyB implements MyInterface<T>{

	@Override
	public T interfaceWork(Object obj) {
		a();
		b();
		return null;
	}

}
