package com.codekata._20.klondike;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    protected Stack<Card> cardStack = new Stack<>();

    public Deck() {
        init();
    }

    public int size(){
        return cardStack.size();
    }

    public Deck getSubDeck(int deckSize) {
        Deck deck = new Deck(true);
        deck.cardStack = getCardSubStack(deckSize);
        return deck;
    }

    public Card getCard() {
        return cardStack.pop();
    }

    public void addCard(Card card){
        cardStack.push(card);
    }

    public boolean isEmpty(){
        return cardStack.isEmpty();
    }

    //this private constructor is used to not create the cardStack when it will be setted later
    private Deck(boolean b){}

    private Stack<Card> getCardSubStack(int subStackSize){
        Stack<Card> subStack = new Stack<>();

        for(int i = 0; i < subStackSize; i++){
            subStack.push(cardStack.pop());
        }

        return subStack;
    }

    private void init(){
        generateSuit(CardType.DIAMONDS);
        generateSuit(CardType.HEARTS);
        generateSuit(CardType.CLUBS);
        generateSuit(CardType.PIKES);
    }

    private void generateSuit(CardType cardType){
        for(CardValue cardValue : CardValue.values()){
            cardStack.push(new Card(cardType, cardValue));
        }
        Collections.shuffle(cardStack);
    }
}
