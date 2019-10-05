package com.codekata._20.klondike;

import java.util.ArrayList;
import java.util.List;

public class FoundationPile {
    private List<Card> cardList;

    public FoundationPile() {
        this.cardList = new ArrayList<>();
    }

    public boolean add(Card card) {
        if(cardList.isEmpty() && card.getValue().equals(CardValue.ACE)){
            cardList.add(card);
            return true;
        }

        if(!cardList.isEmpty() && isSameSuit(card) && isNextHighest(card)){
            cardList.add(card);
            return true;
        }

        return false;
    }

    private boolean isNextHighest(Card card){
        return cardList.get(cardList.size() - 1).getValue().compareTo(card.getValue()) == -1;
    }

    private boolean isSameSuit(Card card) {
        return card.getType().equals(cardList.get(0).getType());
    }
}
