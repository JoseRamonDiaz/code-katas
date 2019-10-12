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
        Card tableauCard = this.deck.peekCard();

        if(tableauCard.isNextHighest(cardIn) && tableauCard.isDifferentColor(cardIn)){
            while(!subDeck.isEmpty()){
                this.deck.addCard(subDeck.getCard());
            }
            return true;
        }

        return false;
    }
}
