package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.*;

public class FoundationPileTest {

    @Test
    public void testAddFirstCardTrue(){
        FoundationPile foundation = new FoundationPile();
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.ACE)));
        assertEquals(1, foundation.size());
    }

    @Test
    public void testAddFirstCardFalse(){
        FoundationPile foundation = new FoundationPile();
        assertFalse(foundation.add(new Card(CardType.DIAMONDS, CardValue.FIVE)));
        assertEquals(0, foundation.size());
    }

    @Test
    public void testAddCardTrue(){
        FoundationPile foundation = new FoundationPile();
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.ACE)));
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.TWO)));
        assertEquals(2, foundation.size());
    }

    @Test
    public void testAddCardFalse(){
        FoundationPile foundation = new FoundationPile();
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.ACE)));
        assertFalse(foundation.add(new Card(CardType.DIAMONDS, CardValue.THREE)));
    }

    @Test
    public void testAddCardDifferentSuit(){
        FoundationPile foundation = new FoundationPile();
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.ACE)));
        assertFalse(foundation.add(new Card(CardType.HEARTS, CardValue.TWO)));
        assertEquals(1, foundation.size());
    }
}
