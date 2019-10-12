package com.codekata._20.klondike;

public class TableauPile {
    private Deck deck;

    public TableauPile(Deck deck){
        this.deck = deck;
    }

    public Deck getSubDeck(int size) {
        return deck.getSubDeck(size);
    }

    public int size(){
        return deck.size();
    }

    public boolean addCards(Deck subDeck) {
        Card cardIn = subDeck.peekCard();

        if(this.deck.isEmpty()){
            if(cardIn.getValue().equals(CardValue.KING)){
                loadIntoDeck(subDeck);
                return true;
            } else {
                return false;
            }
        } else if(deck.peekCard().isNextHighest(cardIn) && deck.peekCard().isDifferentColor(cardIn)){
            loadIntoDeck(subDeck);
            return true;
        }

        return false;
    }

    private void loadIntoDeck(Deck subDeck) {
        while(!subDeck.isEmpty()){
            this.deck.addCard(subDeck.getCard());
        }
    }
}
