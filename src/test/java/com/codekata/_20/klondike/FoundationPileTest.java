package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FoundationPileTest {

    @Test
    public void testAddFirstCardTrue(){
        FoundationPile foundation = new FoundationPile();
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.ACE)));
    }

    @Test
    public void testAddFirstCardFalse(){
        FoundationPile foundation = new FoundationPile();
        assertFalse(foundation.add(new Card(CardType.DIAMONDS, CardValue.FIVE)));
    }

    @Test
    public void testAddCardTrue(){
        FoundationPile foundation = new FoundationPile();
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.ACE)));
        assertTrue(foundation.add(new Card(CardType.DIAMONDS, CardValue.TWO)));
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
    }
}
