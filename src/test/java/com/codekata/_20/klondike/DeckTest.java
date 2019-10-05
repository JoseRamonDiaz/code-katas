package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeckTest {
    @Test
    public void testGenerateFullDeck(){
        Deck deck = new Deck();
        assertEquals(52, deck.size());
    }

    @Test
    public void testGetSubDeck(){
        Deck deck = new Deck();
        assertEquals(52, deck.size());
        assertEquals(20, deck.getSubDeck(20).size());
        assertEquals(52-20, deck.size());
    }

    @Test
    public void testGetCard(){
        Deck deck = new Deck();
        Card card = deck.getCard();
        assertNotNull(card);
        assertEquals(51, deck.size());
    }
}
