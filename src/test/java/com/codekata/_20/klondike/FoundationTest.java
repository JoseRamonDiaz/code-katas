package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.*;

public class FoundationTest {
    @Test
    public void testAddCardToEmptyPile(){
        Foundation foundation = new Foundation();
        assertTrue(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.ACE)));
    }

    @Test
    public void testAddCardToNotEmptyPileFalse(){
        Foundation foundation = new Foundation();
        assertTrue(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.ACE)));
        assertFalse(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.ACE)));
        assertFalse(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.THREE)));
    }

    @Test
    public void testAddCardToNotEmptyPileTrue(){
        Foundation foundation = new Foundation();
        assertTrue(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.ACE)));
        assertTrue(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.TWO)));
        assertTrue(foundation.add(FoundationPileIndex.FIRST, new Card(CardType.HEARTS, CardValue.THREE)));
    }
}
