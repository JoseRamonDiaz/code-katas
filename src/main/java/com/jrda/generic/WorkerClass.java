package com.jrda.generic;

public class WorkerClass<T> {

	public T work() {
		MyInterface<T> mi = new MyInterfaceImpl<T>();
		return mi.interfaceWork(new Object());
	}
	
}
