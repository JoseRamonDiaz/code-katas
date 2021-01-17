package com.jrda.kata_log_christmas.wardrobe;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class WardrobeTest {
	@Test
	public void test() {
		System.out.println(generateComb(4));
	}

	private List<String> generateComb(int n) {
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		List<String> combinations1 = new ArrayList<>();
		combinations1.add(a);
		combinations1.add(b);
		combinations1.add(c);
		combinations1.add(d);

		if (n == 1) {
			return combinations1;
		}

		List<String> combinations2 = new ArrayList<>();
		for (String c0 : combinations1) {
			for (String c1 : generateComb(n - 1)) {
				combinations2.add(c0 + c1);
			}
		}

		return combinations2;
	}

	@Test
	public void testGetCombinations() {
		Wardrobe w = new Wardrobe();
		ElementsPack ep0 = new ElementsPack();
		ep0.push(new Element(50));
		ep0.push(new Element(50));
		ep0.push(new Element(50));
		ep0.push(new Element(50));
		
		ElementsPack ep1 = new ElementsPack();
		ep1.push(new Element(50));
		ep1.push(new Element(50));
		ep1.push(new Element(100));
		
		ElementsPack ep2 = new ElementsPack();
		ep2.push(new Element(50));
		ep2.push(new Element(75));
		ep2.push(new Element(75));
		
		ElementsPack ep3 = new ElementsPack();
		ep3.push(new Element(75));
		ep3.push(new Element(125));
		
		ElementsPack ep4 = new ElementsPack();
		ep4.push(new Element(100));
		ep4.push(new Element(100));
		
		List<ElementsPack> expectedEpList = new ArrayList() {{
			add(ep0);
			add(ep1);
			add(ep2);
			add(ep3);
			add(ep4);
		}};
		
		List<ElementsPack> epList = w.getCombinations();
		assertNotNull(epList);
		printList(epList);
		assertFalse(epList.isEmpty());
		assertTrue(expectedEpList.size() == epList.size() && expectedEpList.containsAll(epList) && epList.containsAll(expectedEpList));
	}

	private void printList(List<ElementsPack> epList) {
		for (ElementsPack ep : epList) {
			System.out.println(ep.toString());
		}
	}
}
