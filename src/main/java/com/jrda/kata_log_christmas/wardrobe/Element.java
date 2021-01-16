package com.jrda.kata_log_christmas.wardrobe;

import java.util.Objects;

public class Element {
	private final int size;

	public Element(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Element)) {
			return false;
		}
		Element other = (Element) obj;
		return size == other.size;
	}

}
