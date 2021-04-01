package com.jrda.kata_log.game_of_life;

import java.util.List;

public class Cell {
    List<Cell> neighbors;
    private State state;

    public void check() {
        state.check();
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Cell> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Cell> neighbors) {
        this.neighbors = neighbors;
    }

    public boolean isAlive() {
        return this.state.isAlive();
    }
}
