package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FoundationTest {
    @Test
    public void testAddCardToEmptyPile(){
        Foundation foundation = new Foundation();
        assertTrue(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.ACE)));
    }

    @Test
    public void testAddCardToNotEmptyPile(){
        Foundation foundation = new Foundation();
        assertTrue(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.ACE)));
        assertFalse(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.THREE)));
    }
}
