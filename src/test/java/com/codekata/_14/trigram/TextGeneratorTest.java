package com.codekata._14.trigram;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TextGeneratorTest {

	@Test
	public void testOneWordOption() {
		TextGenerator tg = new TextGenerator();
		assertEquals("i wish i", tg.getText("i wish", 1));
	}
}
