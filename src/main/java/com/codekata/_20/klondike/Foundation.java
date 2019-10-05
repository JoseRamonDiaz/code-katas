package com.codekata._20.klondike;

public class Foundation {
    FoundationPile[] foundationPiles = new FoundationPile[3];

    public boolean add(FoundationPileIndex foundationPileIndex, Card card) {
        if(foundationPiles[foundationPileIndex.ordinal()] == null){
            foundationPiles[foundationPileIndex.ordinal()] = new FoundationPile();
        }

        return foundationPiles[foundationPileIndex.ordinal()].add(card);
    }
}
