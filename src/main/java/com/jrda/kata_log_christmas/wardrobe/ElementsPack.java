package com.jrda.kata_log_christmas.wardrobe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ElementsPack {
	private Stack<Element> elementsStack;
	private final int target = 200;
	
	public ElementsPack() {
		this.elementsStack = new Stack<Element>();
	}
	
	private ElementsPack(Stack<Element> s) {
		this.elementsStack = s;
	}

	@SuppressWarnings("unchecked")
    public ElementsPack(ElementsPack ep0, ElementsPack ep1) {
		this.elementsStack = (Stack<Element>) ep0.elementsStack.clone();

		for (Element element : ep1.elementsStack) {
			this.elementsStack.push(element);
		}
    }

    public void push(Element element) {
		elementsStack.push(element);
	}

	public Element pop() {
		return elementsStack.pop();
	}

	public boolean isEmpty() {
		return elementsStack.isEmpty();
	}
	
	@SuppressWarnings("unchecked")
	public ElementsPack clone() {
		return new ElementsPack((Stack<Element>) this.elementsStack.clone());
	}

	@Override
	public int hashCode() {
		return Objects.hash(elementsStack);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ElementsPack)) {
			return false;
		}
		ElementsPack other = (ElementsPack) obj;
		
		if (elementsStack.size() != other.elementsStack.size()) {
			return false;
		}
		
		Map<Element, Integer> thisElementsCount = getCount(elementsStack);
		Map<Element, Integer> otherElementsCount = getCount(other.elementsStack);
		
		for(Element e : thisElementsCount.keySet()) {
			if (thisElementsCount.get(e) != otherElementsCount.get(e)) {
				return false;
			}
		}
		
		return true;
	}

	private Map<Element, Integer> getCount(Stack<Element> es) {
		Map<Element, Integer> thisElementsCount = new HashMap<Element, Integer>();
		Iterator<Element> iterator = es.iterator();
		
		while(iterator.hasNext()) {
			Element e = iterator.next();
			
			Integer count = thisElementsCount.get(e);
			if (count == null) {
				count = 0;
			} else {
				count++;
			}
			
			thisElementsCount.put(e, count);
		}
		
		return thisElementsCount;
	}

	public int getRemaining() {
		return target - elementsStack.stream().mapToInt(Element::getSize).sum();
	}

	@Override
	public String toString() {
		String s = "[";
		
		Iterator<Element> iterator = elementsStack.iterator();
		
		while(iterator.hasNext()) {
			s = s + " " + iterator.next().getSize();
			if (iterator.hasNext()) {
				s = s + ", ";
			}
		}
		
		s = s + "]";
		
		return s;
	}
	
}
