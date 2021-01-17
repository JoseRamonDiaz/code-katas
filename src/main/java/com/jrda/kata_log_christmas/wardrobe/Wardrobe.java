package com.jrda.kata_log_christmas.wardrobe;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
	private final Element e0;
	private final Element e1;
	private final Element e2;
	private final Element e3;
	List<Element> eList;
	
	public Wardrobe() {
		e0 = new Element(50, 59);
		e1 = new Element(75, 62);
		e2 = new Element(100, 90);
		e3 = new Element(125, 111);
		
		eList = new ArrayList<>();
		eList.add(e0); 
		eList.add(e1); 
		eList.add(e2); 
		eList.add(e3); 
	}

	public List<ElementsPack> getCombinations() {
		List<ElementsPack> allElementsPackList = new ArrayList<>();

		for (int i = 1; i <= 4; i++) {
			allElementsPackList.addAll(generateAllCombinations(i));
		}

		List<ElementsPack> goodElementsPackList = new ArrayList<>();
		for (ElementsPack ep : allElementsPackList) {
			if (ep.getRemaining() == 0 && !goodElementsPackList.contains(ep))
				goodElementsPackList.add(ep);
		}

		return goodElementsPackList;
	}

	private List<ElementsPack> generateAllCombinations(int n) {

		List<ElementsPack> combinations1 = generateCombSizeOne();

		if (n == 1) {
			return combinations1;
		}

		List<ElementsPack> combinations2 = new ArrayList<>();
		for (ElementsPack ep0 : combinations1) {
			for (ElementsPack ep1 : generateAllCombinations(n - 1)) {
				combinations2.add(new ElementsPack(ep0, ep1));
			}
		}

		return combinations2;
	}

	private List<ElementsPack> generateCombSizeOne() {
		ElementsPack elementsPack0 = new ElementsPack();
		elementsPack0.push(e0);

		ElementsPack elementsPack1 = new ElementsPack();
		elementsPack1.push(e1);

		ElementsPack elementsPack2 = new ElementsPack();
		elementsPack2.push(e2);

		ElementsPack elementsPack3 = new ElementsPack();
		elementsPack3.push(e3);

		List<ElementsPack> combinations1 = new ArrayList<>();
		combinations1.add(elementsPack0);
		combinations1.add(elementsPack1);
		combinations1.add(elementsPack2);
		combinations1.add(elementsPack3);

		return combinations1;
	}

	public ElementsPack getCheapestComb() {
		ElementsPack cheapestElementsPack = null;

		for (ElementsPack ep : getCombinations()) {
			if (cheapestElementsPack == null) {
				cheapestElementsPack = ep;
			}

			if (ep.getPrice() < cheapestElementsPack.getPrice()) {
				cheapestElementsPack = ep;
			}
		}

		return cheapestElementsPack;
	}
}
