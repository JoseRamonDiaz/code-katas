package com.jrda.kata_log.game_of_life;

import java.util.List;

public abstract class State {
    protected short liveCells = 0;
    protected Cell cell;

    public State(Cell cell) {
        this.cell = cell;
    }

    public void check() {
        List<Cell> neighbors = cell.getNeighbors();

        for (Cell n : neighbors) {
            if (n.getState().isAlive())
                liveCells++;
        }

        reviewConditions();
    }

    protected abstract void reviewConditions();

    public abstract boolean isAlive();
}
