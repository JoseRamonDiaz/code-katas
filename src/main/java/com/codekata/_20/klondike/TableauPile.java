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

    public void addCards(Deck subDeck) {
        Card cardIn = subDeck.getCard();
        Card tableauCard = this.deck.getCard();

        if(tableauCard.isNextHighest(cardIn)){
            this.deck.addCard(tableauCard);
            this.deck.addCard(cardIn);
            while(!subDeck.isEmpty()){
                this.deck.addCard(subDeck.getCard());
            }
        }
    }
}
