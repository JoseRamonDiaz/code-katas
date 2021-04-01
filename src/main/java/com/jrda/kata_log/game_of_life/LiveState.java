package com.jrda.kata_log.game_of_life;

public class LiveState extends State {

    public LiveState(Cell cell) {
        super(cell);
    }

    @Override
    protected void reviewConditions() {
        if (liveCells < 2)
            cell.setState(new DeadState(cell));

        if (liveCells > 3)
            cell.setState(new DeadState(cell));
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
