package com.codekata._20.klondike;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TableauPileTest {
    @Test
    public void testTableauPileCreation(){
        Deck deck = new Deck();
        new TableauPile(deck);
    }

    @Test
    public void testGetCards(){
        Deck deck = new Deck();
        TableauPile tableauPile = new TableauPile(deck.getSubDeck(7));
        Deck subDeck = tableauPile.getSubDeck(3);
        assertEquals(4, tableauPile.size());
        assertEquals(3, subDeck.size());
    }

    @Test
    public void testAcceptAddCards(){
        DeckForTesting deckForTesting = new DeckForTesting();
        deckForTesting.setCardStack(getCardStack123());
        TableauPile tableauPile = new TableauPile(deckForTesting);

        DeckForTesting deckForTesting1 = new DeckForTesting();
        deckForTesting1.setCardStack(getCardStack456());
        TableauPile tableauPile1 = new TableauPile(deckForTesting1);

        tableauPile.addCards(tableauPile1.getSubDeck(3));
        assertEquals(6, tableauPile.size());
    }

    private Stack<Card> getCardStack123(){
        Stack<Card> cardStack = new Stack<>();
        cardStack.push(new Card(CardType.PIKES, CardValue.ACE));
        cardStack.push(new Card(CardType.PIKES, CardValue.TWO));
        cardStack.push(new Card(CardType.PIKES, CardValue.THREE));
        return cardStack;
    }

    private Stack<Card> getCardStack456(){
        Stack<Card> cardStack = new Stack<>();
        cardStack.push(new Card(CardType.PIKES, CardValue.FOUR));
        cardStack.push(new Card(CardType.PIKES, CardValue.FIVE));
        cardStack.push(new Card(CardType.PIKES, CardValue.SIX));
        return cardStack;
    }

    //TODO test that the cards we are taking from TableauPile really are the last ones ?
}
