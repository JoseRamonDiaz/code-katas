package com.jrda.kata_log.game_of_life;

import com.jrda.kata_log.game_of_life.application.GameOfLife;
import org.junit.Test;

public class GameOfLifeTest {
    @Test
    public void testGridGeneration() {
        GameOfLife gameOfLife = new GameOfLife(100, 0.50);
        System.out.println(gameOfLife.toString());

//        System.out.println("###########TICK###########");
//        gameOfLife.tick();
//        System.out.println(gameOfLife.toString());

        while(true){
            gameOfLife.tick();
            System.out.println(gameOfLife.toString());
        }

    }
}