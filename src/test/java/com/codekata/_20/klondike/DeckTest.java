package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testShuffle(){
        Deck deck = new Deck();
        Deck deck1 = new Deck();

        Card card = deck.getCard();
        Card card1 = deck1.getCard();

        boolean sameOrder = true;
        for(int i = 0; i < 52; i++){
            sameOrder = sameOrder && card.getType().equals(card1.getType()) && card.getValue().equals(card1.getValue());
        }
        assertFalse(sameOrder);
    }

    @Test
    public void testPeekCard(){
        Deck deck = new Deck();
        assertNotNull(deck.peekCard());
        assertEquals(52, deck.size());
    }
}
