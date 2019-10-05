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

    public void setType(CardType type) {
        this.type = type;
    }

    public CardValue getValue() {
        return value;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }
}
