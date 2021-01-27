package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GameStateTest {
    @Test
    public void testGetStock(){
        GameState gameState = new GameState();
        Deck stock = gameState.getStock();
//        assertNotNull(stock);
    }
}
