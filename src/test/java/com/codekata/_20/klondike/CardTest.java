package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    @Test
    public void testGetValue(){
        Card card = new Card(CardType.DIAMONDS, CardValue.ACE);
        assertEquals(CardType.DIAMONDS, card.getType());
        assertEquals(CardValue.ACE, card.getValue());
    }
}
