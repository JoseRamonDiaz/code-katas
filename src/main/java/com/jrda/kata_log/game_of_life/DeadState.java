package com.jrda.kata_log.game_of_life;

public class DeadState extends State {

    public DeadState(Cell cell) {
        super(cell);
    }

    @Override
    protected void reviewConditions() {
        if (liveCells == 3)
            cell.setState(new LiveState(cell));
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
