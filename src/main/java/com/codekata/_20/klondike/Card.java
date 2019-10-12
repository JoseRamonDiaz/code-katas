package com.codekata._20.klondike;

public class Card {
    private CardType type;
    private CardValue value;

    public Card(CardType cardType, CardValue cardValue) {
        this.type = cardType;
        this.value = cardValue;
    }

    public CardType getType() {
        return type;
    }

    public CardValue getValue() {
        return value;
    }

    public boolean isNextHighest(Card card){
        return this.getValue().compareTo(card.getValue()) == -1;
    }

    public boolean isSameSuit(Card card) {
        return card.getType().equals(this.getType());
    }
}
