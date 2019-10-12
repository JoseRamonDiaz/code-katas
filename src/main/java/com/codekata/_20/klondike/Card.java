package com.codekata._20.klondike;

public class Card {
    private CardType type;
    private CardValue value;
    private CardColor color;

    public Card(CardType cardType, CardValue cardValue) {
        this.type = cardType;
        this.value = cardValue;
        resolveColor(cardType);
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

    public boolean isDifferentColor(Card card){
        return !this.color.equals(card.color);
    }

    private void resolveColor(CardType cardType) {
        if (cardType.equals(CardType.HEARTS) || cardType.equals(CardType.DIAMONDS)) {
            color = CardColor.RED;
        } else {
            color = CardColor.BLACK;
        }
    }
}
