package com.jrda.kata_log.wardrobe;

import java.util.Objects;

public class Element {
	private final int size;
	private final double price;

	protected Element(int size) {
		this.size = size;
		this.price = 0;
	}

	public Element(int size, double price) {
		this.size = size;
		this.price = price;
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

	public double getPrice() {
		return price;
	}
}
